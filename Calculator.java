
public class Calculator {
	
	public int evaluate(String expression) {
		int sum = 0;
		for (String summand : expression.split("\\+"))
			sum += Integer.valueOf(summand);
		System.out.println("Suma: "+sum);
		return sum;
	}
	
	public String evaluateEmail() {
		
		
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
