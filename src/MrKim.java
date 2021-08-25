
public class MrKim {
	int age;
	String name;
	boolean marriage;
	int children;

	public static void main(String[] args) {
		MrKim kim = new MrKim();
		kim.age = 50;
		kim.name = "±è»çºÎ";
		kim.marriage = true;
		kim.children = 4;
		
		System.out.println("³ªÀÌ : " + kim.age);
		System.out.println("ÀÌ¸§ : " + kim.name);
		System.out.println("°áÈ¥ ¿©ºÎ : " + kim.marriage);
		System.out.println("ÀÚ³à ¼ö : " + kim.children);

	}

}
