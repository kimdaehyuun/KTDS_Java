
public class Average_Calculator_Grade {

	public static void main(String[] args) {
		double math = 83.7;
		String grade = "";
		
		if (math > 95) {
			grade = "A+";
		} else if (math > 90) {
			grade = "A";
		} else if (math > 85) {
			grade = "B+";
		} else if (math > 80) {
			grade = "B";
		} else if (math > 70) {
			grade = "C";
		} else if (math > 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);

	}

}
