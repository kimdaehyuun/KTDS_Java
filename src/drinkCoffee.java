
public class drinkCoffee {

	public static void main(String[] args) {
		Coffee teacherVicky = new Coffee("Vicky", "�Ƹ޸�ī��", 10000);
		Coffee teacherSpencer = new Coffee("Spencer", "ī���", 25000);
		
		StarCoffee seoulStar = new StarCoffee("���￪ ���ٹ�");
		teacherVicky.drink(seoulStar);
		teacherVicky.showInfo();
		seoulStar.showInfo();
		
		KongCoffee gimpoKong = new KongCoffee("�������� ��ٹ�");
		teacherSpencer.drink(gimpoKong);
		teacherSpencer.showInfo();
		gimpoKong.showInfo();

	}

}
