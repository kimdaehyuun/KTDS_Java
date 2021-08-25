package exam2;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) { //태어난 연도를 지정하는 메소드
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this); //this 출력
	}
	
	public String toString() {
		return year + "년 " + month + "월 " + day + "일";
	}
}


public class ThisExample {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //연도를 2000으로 지정
		System.out.println(bDay); //참조변수출력
		bDay.printThis();
	}

}
