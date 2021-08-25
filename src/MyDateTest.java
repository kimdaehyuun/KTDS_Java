
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(29, 1, 2021);
		
		// 에러가 안났으면
		if (date.error() == 0) {
			System.out.print(date.getYear() + "년 ");
			System.out.print(date.getMonth() + "월 ");
			System.out.print(date.getDay() + "일");
		}
//		에러가 났으면
		else if (date.noError() == 0) {
			System.out.println();
		}
		
		

	}

}
