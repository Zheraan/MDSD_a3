package math_expression.test;

import math_expression.*;

class ExternalImpl implements Test27.External, Test28.External, Test29.External, Test30.External, Test31.External, Test34.External {

	public int pi() {
		return 3; // We really are doing engineering here
	}

	public int sqrt(int n) {
		return (int) Math.sqrt(n);
	}
	
	public int pow(int n, int m) {
		int result = n;
		for(int i=1; i<m; i++) {
			result *= n;
		}
		return result;
	}
	
}
