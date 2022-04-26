/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarBinding
import dk.sdu.mmmi.mdsd.math.VariableUse
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.Program
import java.util.ArrayList
import dk.sdu.mmmi.mdsd.math.PiUse
import dk.sdu.mmmi.mdsd.math.ExternalDef
import dk.sdu.mmmi.mdsd.math.SqrtUse
import dk.sdu.mmmi.mdsd.math.PowerUse
import dk.sdu.mmmi.mdsd.math.Parenthesis
import java.util.LinkedHashMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	
	static Map<String, String> variables;
	static Map<String, String> externals;
	static boolean hasExternals;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val program = resource.allContents.filter(Program).next
		val math = resource.allContents.filter(MathExp).next
		val ext = resource.allContents.filter(ExternalDef).next
		hasExternals = !compute(math, ext).isEmpty
		val name = program.getProgramName
		fsa.generateFile("/math_expression/" + name + ".java", name.compile);
	}
	
	def static String getProgramName(Program p){
		return p.name
	}
	
	def static compute(MathExp math, ExternalDef ext) {
		variables = new LinkedHashMap()
		for(varBinding: math.variables)
			varBinding.computeExpression()
			
		externals = new LinkedHashMap()
		for(f: ext.functions)
			f.f.computeExternals()
			
		return externals
	}
	
	def static computeExternals(String function){
		if(!externals.containsKey(function))
			switch function{
				case 'pi':
					externals.put(function, "()")	
				case 'sqrt':
					externals.put(function, "(int n)" )	
				case 'pow':
					externals.put(function, "(int n, int m)")	
		}
	}
	
	def static dispatch String computeExpression(VarBinding binding) {
		variables.put(binding.name, binding.expression.computeExpression())
		return variables.get(binding.name)
	}
	
	def static dispatch String computeExpression(MathNumber exp) {
		exp.value.toString
	}
	
	def static dispatch String computeExpression(Parenthesis exp) {
		"(" + exp.exp.computeExpression + ")"
	}
	
	def static dispatch String computeExpression(SqrtUse exp) {
		"this.external.sqrt(" + exp.exp.computeExpression + ")"
	}
	
	def static dispatch String computeExpression(PowerUse exp) {
		"this.external.pow(" + exp.first.computeExpression + ", " + exp.second.computeExpression + ")"
	}

	def static dispatch String computeExpression(PiUse exp) {
		"this.external.pi()"
	}

	def static dispatch String computeExpression(Plus exp) {
		exp.left.computeExpression + " + " + exp.right.computeExpression
	}
	
	def static dispatch String computeExpression(Minus exp) {
		exp.left.computeExpression + " - " + exp.right.computeExpression
	}
	
	def static dispatch String computeExpression(Mult exp) {
		exp.left.computeExpression + " * " + exp.right.computeExpression
	}
	
	def static dispatch String computeExpression(Div exp) {
		exp.left.computeExpression + " / " + exp.right.computeExpression
	}

	def static dispatch String computeExpression(LetBinding exp) {
		exp.body.computeExpression
	}
	
	def static dispatch String computeExpression(VariableUse exp) {
		"(" + exp.ref.computeBinding + ")"
	}

	def static dispatch String computeBinding(VarBinding binding){
		if(!variables.containsKey(binding.name))
			binding.computeExpression()			
		binding.name
	}
	
	def static dispatch String computeBinding(LetBinding binding){
		binding.binding.computeExpression
	}
	
	def static compile(String progname){
		
		var varList = variables !== null ? new ArrayList(variables.entrySet()) : new ArrayList()
		var extList = externals !== null ? new ArrayList(externals.entrySet()) : new ArrayList()
		'''
		package math_expression;
		
		public class «progname»{
			
			«FOR v : varList»
			public int «v.getKey()»;
			«ENDFOR»
			
			«IF hasExternals»
			private External external;
			
			public «progname»(External external){
				this.external = external;
			}
			«ENDIF»
			
			public void compute(){
				«FOR v : varList»
				«v.getKey()» = «v.getValue()»;
				«ENDFOR»
			}
			
			«IF hasExternals»
			public interface External{
				«FOR e : extList»
				public int «e.getKey()»«e.getValue()»;
				«ENDFOR»
			}
			«ENDIF»
		}
		'''
	}
	
}