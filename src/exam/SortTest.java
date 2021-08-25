package exam;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택 하세요.");
		System.out.println("H : HeapSort를 이용해 정렬 ");
		System.out.println("Q : QuickSort를 이용해 정렬 ");
		System.out.println("B : BubbleSort를 이용해 정렬 ");
		
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
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		int[] arr1 = {};
		int[] arr2 = {};
		
		sort.ascending(arr1);
		sort.descending(arr2);
		sort.description();
	}

}
