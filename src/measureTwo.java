import java.util.Scanner;

public class measureTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Measure yaksu = new Measure();
		System.out.println("ģȭ������ Ȯ���� �� ���� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		yaksu.setA(a); // �ڱ��ڽ��� ������ a�� ����� ���� ���Ѵ�.
		yaksu.setB(b); // �ڱ��ڽ��� ������ b�� ����� ���� ���Ѵ�.
		
		int aSum = yaksu.getA();
		int bSum = yaksu.getB();
		
		if (aSum == b && bSum == a) {
			System.out.println(a + "�� " + b + "�� ģȭ���̴�.");
		} else {
			System.out.println(a + "�� " + b + "�� ģȭ���� �ƴϴ�.");
		}

	}

}
