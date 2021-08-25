
public class gugudan2 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i + "´Ü");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}

	}

}
