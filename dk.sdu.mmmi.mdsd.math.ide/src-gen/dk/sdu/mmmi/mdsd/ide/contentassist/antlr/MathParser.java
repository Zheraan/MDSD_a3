/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal.InternalMathParser;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MathParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
			builder.put(grammarAccess.getFunctionUseAccess().getAlternatives(), "rule__FunctionUse__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getBindingAccess().getAlternatives(), "rule__Binding__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getExternalDefAccess().getGroup(), "rule__ExternalDef__Group__0");
			builder.put(grammarAccess.getExternalDefAccess().getGroup_0(), "rule__ExternalDef__Group_0__0");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getVarBindingAccess().getGroup(), "rule__VarBinding__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_0(), "rule__Function__Group_0__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_1(), "rule__Function__Group_1__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_2(), "rule__Function__Group_2__0");
			builder.put(grammarAccess.getFunctionUseAccess().getGroup_2(), "rule__FunctionUse__Group_2__0");
			builder.put(grammarAccess.getSqrtUseAccess().getGroup(), "rule__SqrtUse__Group__0");
			builder.put(grammarAccess.getPowerUseAccess().getGroup(), "rule__PowerUse__Group__0");
			builder.put(grammarAccess.getPIAccess().getGroup(), "rule__PI__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getLetBindingAccess().getGroup(), "rule__LetBinding__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getExternalsAssignment_2(), "rule__Program__ExternalsAssignment_2");
			builder.put(grammarAccess.getExternalDefAccess().getFunctionsAssignment_0_1(), "rule__ExternalDef__FunctionsAssignment_0_1");
			builder.put(grammarAccess.getExternalDefAccess().getExpAssignment_1(), "rule__ExternalDef__ExpAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getVariablesAssignment_1(), "rule__MathExp__VariablesAssignment_1");
			builder.put(grammarAccess.getVarBindingAccess().getNameAssignment_1(), "rule__VarBinding__NameAssignment_1");
			builder.put(grammarAccess.getVarBindingAccess().getExpressionAssignment_3(), "rule__VarBinding__ExpressionAssignment_3");
			builder.put(grammarAccess.getFunctionAccess().getFAssignment_0_1(), "rule__Function__FAssignment_0_1");
			builder.put(grammarAccess.getFunctionAccess().getFAssignment_1_0(), "rule__Function__FAssignment_1_0");
			builder.put(grammarAccess.getFunctionAccess().getFAssignment_2_0(), "rule__Function__FAssignment_2_0");
			builder.put(grammarAccess.getFunctionUseAccess().getValueAssignment_2_1(), "rule__FunctionUse__ValueAssignment_2_1");
			builder.put(grammarAccess.getSqrtUseAccess().getExpAssignment_2(), "rule__SqrtUse__ExpAssignment_2");
			builder.put(grammarAccess.getPowerUseAccess().getFirstAssignment_2(), "rule__PowerUse__FirstAssignment_2");
			builder.put(grammarAccess.getPowerUseAccess().getSecondAssignment_4(), "rule__PowerUse__SecondAssignment_4");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimaryAccess().getValueAssignment_0_1(), "rule__Primary__ValueAssignment_0_1");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_1(), "rule__Parenthesis__ExpAssignment_1");
			builder.put(grammarAccess.getLetBindingAccess().getNameAssignment_1(), "rule__LetBinding__NameAssignment_1");
			builder.put(grammarAccess.getLetBindingAccess().getBindingAssignment_3(), "rule__LetBinding__BindingAssignment_3");
			builder.put(grammarAccess.getLetBindingAccess().getBodyAssignment_5(), "rule__LetBinding__BodyAssignment_5");
			builder.put(grammarAccess.getVariableUseAccess().getRefAssignment(), "rule__VariableUse__RefAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathGrammarAccess grammarAccess;

	@Override
	protected InternalMathParser createParser() {
		InternalMathParser result = new InternalMathParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
