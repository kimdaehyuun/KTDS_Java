
public class Average_Calculator_Grade_While {

	public static void main(String[] args) {
		double math = 86;
		double korean = 85;
		double english = 76;
		double programming = 90;
		double avg = (math + korean + english + programming) / 4;
		String grade = "";
		int count = 0;
		
		while (count < 3) {
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
			System.out.println(grade);
			count++;
		}
	}

}
