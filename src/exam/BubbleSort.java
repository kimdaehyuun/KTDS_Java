package exam;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] a) {
		System.out.println("BubbleSort Ascending");
	}

	@Override
	public void descending(int[] b) {
		System.out.println("BubbleSort Descending");
	}

	@Override
	public void description() {
		System.out.println("BubbleSort를 사용해 정렬했습니다.");
	}

}
