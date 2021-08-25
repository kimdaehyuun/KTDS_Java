
public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int answer;
		
//		if / else문 사용
		if (operator == '+') {
			answer = num1 + num2;
			System.out.println(answer);
		}
		else if (operator == '-') {
			answer = num1 - num2;
			System.out.println(answer);
		}
		else if (operator == '*') {
			answer = num1 * num2;
			System.out.println(answer);
		}
		else if (operator == '/') {
			answer = num1 / num2;
			System.out.println(answer);
		}
		
//		switch 문 사용
		int result;
		switch (operator) {
			case '+' :
				result = num1 + num2;
				System.out.println(result);
				break;
			case '-' :
				result = num1 - num2;
				System.out.println(result);
				break;
			case '*' :
				result = num1 * num2;
				System.out.println(result);
				break;
			case '/' :
				result = num1 / num2;
				System.out.println(result);
				break;
		}
	}

}
