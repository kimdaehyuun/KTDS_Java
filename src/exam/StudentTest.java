package exam;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeon = new Student();
		
		studentYeon.studentID = studentYeon.getSerialNum(); // 1001 저장
		studentYeon.studentCardNum = studentYeon.studentID + 100; // 1101 저장
		studentYeon.studentName = "연주미";
		System.out.println(studentYeon.studentName + " 카드 번호 : " + studentYeon.studentCardNum);
		
		Student studentLee = new Student();
		studentLee.studentID = studentLee.getSerialNum(); // 1002 저장
		studentLee.studentCardNum = studentLee.studentID + 100; // 1102 저장
		studentLee.studentName = "이지안";
		System.out.println(studentLee.studentName + " 카드 번호 : " + studentLee.studentCardNum);

	}

}
