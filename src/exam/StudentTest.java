package exam;

public class StudentTest {

	public static void main(String[] args) {
		Student studentYeon = new Student();
		
		studentYeon.studentID = studentYeon.getSerialNum(); // 1001 ����
		studentYeon.studentCardNum = studentYeon.studentID + 100; // 1101 ����
		studentYeon.studentName = "���ֹ�";
		System.out.println(studentYeon.studentName + " ī�� ��ȣ : " + studentYeon.studentCardNum);
		
		Student studentLee = new Student();
		studentLee.studentID = studentLee.getSerialNum(); // 1002 ����
		studentLee.studentCardNum = studentLee.studentID + 100; // 1102 ����
		studentLee.studentName = "������";
		System.out.println(studentLee.studentName + " ī�� ��ȣ : " + studentLee.studentCardNum);

	}

}
