package exam;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] a) {
		System.out.println("QuickSort Ascending");
	}

	@Override
	public void descending(int[] b) {
		System.out.println("QuickSort Descending");
	}

	@Override
	public void description() {
		System.out.println("QuickSort를 사용해 정렬했습니다.");
	}

}
