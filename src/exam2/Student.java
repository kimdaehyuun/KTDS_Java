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
//			만약 이제 막 넣는 학생의 번호가 기존의 번호랑 같으면 트루값으로 넘긴다
			if (this.studentId == student.studentId)
				return true;
			else
				return false;
		}
//		아니면 그냥 펄스값으로 넘긴다.
		return false;
	}
	
	public String toString() {
		return studentId + ": " + studentName;
	}
	

}
