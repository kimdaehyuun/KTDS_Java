
public class TakeTrans {

	public static void main(String[] args) {
		// 두 명의 학생을 생성
		Student studentChris = new Student("Chris", 5000); 
		Student studentEmily = new Student("Emily", 10000);
		Student studentJenna = new Student("Jenna", 20000);
		
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100); // Chris가 100번 버스를 탐
		studentChris.showInfo(); // Chris 정보 출력
		bus100.showInfo(); // 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선"); 
		studentEmily.takeSubway(subwayGreen); // Emily가 2호선을 탐
		studentEmily.showInfo(); // Emily 정보 출력
		subwayGreen.showInfo(); // 지하철 정보 출력
		
		Taxi seoulTaxi = new Taxi("서울 택시");
		studentJenna.takeTaxi(seoulTaxi);
		studentJenna.showInfo();
		seoulTaxi.showInfo();

	}

}
