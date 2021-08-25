import java.util.Scanner;

public class Average_Calculator_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		int sum = 0;
		
		System.out.println("수학, 물리, 영어, 프로그래밍의 성적을 입력하시오.");
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		double avg = (double)sum / 4;
		
		System.out.println("평균 : " + avg);
		

	}

}
