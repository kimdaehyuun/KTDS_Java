
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
		System.out.println(cafeName + "의 수입은 " + money + "입니다.");
	}

}
