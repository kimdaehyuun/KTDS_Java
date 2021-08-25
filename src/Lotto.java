
public class Lotto {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int num = 0;
		
		// 우선 1번째 배열 로또번호는 채워놓기
		arr[0] = (int)(Math.random() * 45 + 1);
		
		// 2번째부터 로또번호 채울거
		for (int i = 1; i < 6; i++) {
			num = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				while (num == arr[j]) {
					num = (int)(Math.random() * 45 + 1);
				}
			}
			arr[i] = num;
		}
		//버블 정렬을 사용해 오름차순 정렬
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}

	}

}
