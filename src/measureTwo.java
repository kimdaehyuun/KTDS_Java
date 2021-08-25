import java.util.Scanner;

public class measureTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Measure yaksu = new Measure();
		System.out.println("친화수인지 확인할 두 수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		yaksu.setA(a); // 자기자신을 제외한 a의 약수의 합을 구한다.
		yaksu.setB(b); // 자기자신을 제외한 b의 약수의 합을 구한다.
		
		int aSum = yaksu.getA();
		int bSum = yaksu.getB();
		
		if (aSum == b && bSum == a) {
			System.out.println(a + "와 " + b + "는 친화수이다.");
		} else {
			System.out.println(a + "와 " + b + "는 친화수가 아니다.");
		}

	}

}
