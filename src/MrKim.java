
public class MrKim {
	int age;
	String name;
	boolean marriage;
	int children;

	public static void main(String[] args) {
		MrKim kim = new MrKim();
		kim.age = 50;
		kim.name = "����";
		kim.marriage = true;
		kim.children = 4;
		
		System.out.println("���� : " + kim.age);
		System.out.println("�̸� : " + kim.name);
		System.out.println("��ȥ ���� : " + kim.marriage);
		System.out.println("�ڳ� �� : " + kim.children);

	}

}
