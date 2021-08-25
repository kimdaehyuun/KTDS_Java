
public class drinkCoffee {

	public static void main(String[] args) {
		Coffee teacherVicky = new Coffee("Vicky", "아메리카노", 10000);
		Coffee teacherSpencer = new Coffee("Spencer", "카페라떼", 25000);
		
		StarCoffee seoulStar = new StarCoffee("서울역 별다방");
		teacherVicky.drink(seoulStar);
		teacherVicky.showInfo();
		seoulStar.showInfo();
		
		KongCoffee gimpoKong = new KongCoffee("김포공항 콩다방");
		teacherSpencer.drink(gimpoKong);
		teacherSpencer.showInfo();
		gimpoKong.showInfo();

	}

}
