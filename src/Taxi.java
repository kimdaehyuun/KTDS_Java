
public class Taxi {
	public String taxiArea;
	public int passengerCount;
	public int money;

	public Taxi(String taxiArea) {
		this.taxiArea = taxiArea;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(taxiArea + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}

}
