
public class StarCoffee {
	public String cafeName;
	public int money;

	public StarCoffee(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public void drink(int money) {
		this.money =+ money;
	}
	
	public void showInfo() {
		System.out.println(cafeName + "�� ������ " + money + "�Դϴ�.");
	}

}
