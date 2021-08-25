package exam2;

public class CalcTest {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 35;
		
		Calc calc = (a, b) -> (a + b);
		int sum = calc.add(num1, num2);
		
		System.out.println("гу : " + sum);

	}

}
