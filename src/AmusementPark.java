
public class AmusementPark {

	public static void main(String[] args) {
		int age = 30;
		int fee;
		
		if (age < 8) {
			fee = 1000;
		} else if (age < 14) {
			fee = 2000;
		} else if (age < 20) {
			fee = 2500;
		} else if (age < 60) {
			fee = 3000;
		}
		else {
			fee = 0;
		}
		System.out.println("¿ä±Ý : " + fee);

	}

}
