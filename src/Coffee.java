
public class Coffee {
	public String name;
	public String coffeeName;
	public int money;

	public Coffee(String name, String coffeeName, int money) {
		this.name = name;
		this.coffeeName = coffeeName;
		this.money = money;
	}
	
	public void drink(StarCoffee starCoffee) {
		starCoffee.drink(4000);
		this.money -= 4000;
	}
	
	public void drink(KongCoffee kongCoffee) {
		kongCoffee.drink(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(coffeeName + "�� ���� " + name + "���� ���� ���� " + money + "�Դϴ�.");
	}

}
