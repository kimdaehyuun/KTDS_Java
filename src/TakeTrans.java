
public class TakeTrans {

	public static void main(String[] args) {
		// �� ���� �л��� ����
		Student studentChris = new Student("Chris", 5000); 
		Student studentEmily = new Student("Emily", 10000);
		Student studentJenna = new Student("Jenna", 20000);
		
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100); // Chris�� 100�� ������ Ž
		studentChris.showInfo(); // Chris ���� ���
		bus100.showInfo(); // ���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��"); 
		studentEmily.takeSubway(subwayGreen); // Emily�� 2ȣ���� Ž
		studentEmily.showInfo(); // Emily ���� ���
		subwayGreen.showInfo(); // ����ö ���� ���
		
		Taxi seoulTaxi = new Taxi("���� �ý�");
		studentJenna.takeTaxi(seoulTaxi);
		studentJenna.showInfo();
		seoulTaxi.showInfo();

	}

}
