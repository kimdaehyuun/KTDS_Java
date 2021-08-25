
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	static int error = 0;
	
	// ������ ���� �ȳ��� ��쿣 error�� ���� 0��
	public static int noError() {
		return error = 0;
	}
	
	// ������ ���� ��� error�� 1�� �ٲ�����
	public static int error() {
		return error = 1;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�");
				error = 1;
				return;
			} else {
				this.day = day;
				error = 0;
			}
		}
		// ���� ������ ���� 31���� ���� ���
		else if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			if (day < 1 || day > 31) {
				System.out.println("�����Դϴ�");
				error = 1;
				return;
			} else {
				this.day = day;
				error = 0;
			}
		}
		// ���� ������ ���� 30���� ���� ���
		else {
			if (day < 1 || day > 30) {
				System.out.println("�����Դϴ�");
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
			System.out.println("�����Դϴ�");
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
