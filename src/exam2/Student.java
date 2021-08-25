package exam2;

public class Student {
	private String studentId;
	private String studentName;

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public int hashCode() {
		return Integer.valueOf(studentId);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
//			���� ���� �� �ִ� �л��� ��ȣ�� ������ ��ȣ�� ������ Ʈ�簪���� �ѱ��
			if (this.studentId == student.studentId)
				return true;
			else
				return false;
		}
//		�ƴϸ� �׳� �޽������� �ѱ��.
		return false;
	}
	
	public String toString() {
		return studentId + ": " + studentName;
	}
	

}
