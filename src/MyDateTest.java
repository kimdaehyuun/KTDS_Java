
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(29, 1, 2021);
		
		// ������ �ȳ�����
		if (date.error() == 0) {
			System.out.print(date.getYear() + "�� ");
			System.out.print(date.getMonth() + "�� ");
			System.out.print(date.getDay() + "��");
		}
//		������ ������
		else if (date.noError() == 0) {
			System.out.println();
		}
		
		

	}

}
