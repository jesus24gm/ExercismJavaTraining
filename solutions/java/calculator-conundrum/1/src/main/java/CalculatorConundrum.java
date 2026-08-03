class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
    	int result;
    	if (operation==null) {
			throw new IllegalArgumentException("Operation cannot be null");
		}
    	if (operation.isEmpty()) {
    		throw new IllegalArgumentException("Operation cannot be empty");
		}
    	if (!operation.equals("+")&&!operation.equals("*")&&!operation.equals("/")) {
    		throw new IllegalOperationException("Operation '"+operation+"' does not exist");
		}
    	
    		if ("+".equals(operation)) {
				result=operand1+operand2;
			}
    		else if ("*".equals(operation)) {
    			result=operand1*operand2;
			}
    		else {
    		try {
    			
    			result=operand1/operand2;
        		
			} catch (ArithmeticException e) {
				throw new IllegalOperationException("Division by zero is not allowed", e);
			}
    		}
    			
    		
    	return operand1+" "+operation+" "+operand2+" = "+result;
    }
}
