
public class whileEx2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (a == b || b == c || c == a) {
			a = (int)(Math.random() * 10) + 1;
			b = (int)(Math.random() * 10) + 1;
			c = (int)(Math.random() * 10) + 1;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
