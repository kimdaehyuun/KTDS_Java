
public class KongCoffee {
	public String cafeName;
	public int money;

	public KongCoffee(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public void drink(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(cafeName + "�� ������ " + money + "�Դϴ�.");
	}

}
