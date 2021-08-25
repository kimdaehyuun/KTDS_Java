import java.util.Scanner;

public class Average_Calculator_Grade_Infinite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String text = sc.next();
			if (text.equalsIgnoreCase("quit")) {
				break;
			}
			else if (text.equalsIgnoreCase("keep")) {
				System.out.println("수학 국어 영어 프로그래밍의 점수를 입력하시오 : ");
				double math = sc.nextDouble();
				double korean = sc.nextDouble();
				double english = sc.nextDouble();
				double programming = sc.nextDouble();
				double avg = (math + korean + english + programming) / 4;
				
				String grade = "";
				
				if (avg > 95) {
					grade = "A+";
				} else if (avg > 90) {
					grade = "A";
				} else if (avg > 85) {
					grade = "B+";
				} else if (avg > 80) {
					grade = "B";
				} else if (avg > 70) {
					grade = "C";
				} else if (avg > 60) {
					grade = "D";
				} else {
					grade = "F";
				}
				System.out.println("평균 : " + avg + ", 학점 : " + grade);
			}
		}
	}

}