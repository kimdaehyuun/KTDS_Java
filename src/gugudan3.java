
public class gugudan3 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "´Ü");
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}

	}

}
