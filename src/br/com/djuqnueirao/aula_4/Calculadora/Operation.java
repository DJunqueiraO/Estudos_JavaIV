public interface Operation {
	
    double calculate(double x, double y);
    
    static Operation getInstance(final String operator) {
		if(operator.equals("+")) {
			return new Sum();
		} 
		if(operator.equals("-")) {
			return new Subtract();
		} 
		if(operator.equals("/")) {
			return new Divide();
		} 
		if(operator.equals("*")) {
			return new Multiply();
		} 
		return null;
    }
}