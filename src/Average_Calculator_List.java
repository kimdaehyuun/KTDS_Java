import java.util.ArrayList;
import java.util.Scanner;

public class Average_Calculator_List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<Integer>();
		System.out.println("����, ����, ����, ���α׷����� ������ �Է��Ͻÿ�.");
		int a = sc.nextInt();
		score.add(a);
		int b = sc.nextInt();
		score.add(b);
		int c = sc.nextInt();
		score.add(c);
		int d = sc.nextInt();
		score.add(d);
		
		int math = score.get(0);
		int phy = score.get(1);
		int en = score.get(2);
		int prog = score.get(3);
		
		double avg = (double)(math + phy + en + prog) / 4;
		
		System.out.println("��� : " + avg);

	}

}
