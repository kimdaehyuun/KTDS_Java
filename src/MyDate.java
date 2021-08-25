
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	static int error = 0;
	
	// 에러가 아직 안났을 경우엔 error가 값이 0임
	public static int noError() {
		return error = 0;
	}
	
	// 에러가 났을 경우 error을 1로 바꿔줬음
	public static int error() {
		return error = 1;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다");
				error = 1;
				return;
			} else {
				this.day = day;
				error = 0;
			}
		}
		// 달의 마지막 날이 31일인 달의 경우
		else if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			if (day < 1 || day > 31) {
				System.out.println("오류입니다");
				error = 1;
				return;
			} else {
				this.day = day;
				error = 0;
			}
		}
		// 달의 마지막 날이 30일인 달의 경우
		else {
			if (day < 1 || day > 30) {
				System.out.println("오류입니다");
				error = 1;
				return;
			} else {
				this.day = day;
				error = 0;
			}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("오류입니다");
			error = 1;
			return;
		} else {
			this.month = month;
			error = 0;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

}
