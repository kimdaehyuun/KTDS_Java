import java.util.Scanner;

public class Average_Calculator_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		int sum = 0;
		
		System.out.println("����, ����, ����, ���α׷����� ������ �Է��Ͻÿ�.");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		double avg = (double)sum / 4;
		
		System.out.println("��� : " + avg);
		

	}

}
