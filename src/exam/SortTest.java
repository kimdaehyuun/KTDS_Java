package exam;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� ���� �ϼ���.");
		System.out.println("H : HeapSort�� �̿��� ���� ");
		System.out.println("Q : QuickSort�� �̿��� ���� ");
		System.out.println("B : BubbleSort�� �̿��� ���� ");
		
		int read = System.in.read();
		Sort sort = null;
		
		if (read == 'H' || read == 'h') {
			sort = new HeapSort();
		} 
		else if (read == 'Q' || read == 'q') {
			sort = new QuickSort();
		} 
		else if (read == 'B'|| read == 'b') {
			sort = new BubbleSort();
		} 
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		int[] arr1 = {};
		int[] arr2 = {};
		
		sort.ascending(arr1);
		sort.descending(arr2);
		sort.description();
	}

}
