
public class Lotto {

	public static void main(String[] args) {
		int[] arr = new int[6];
		int num = 0;
		
		// �켱 1��° �迭 �ζǹ�ȣ�� ä������
		arr[0] = (int)(Math.random() * 45 + 1);
		
		// 2��°���� �ζǹ�ȣ ä���
		for (int i = 1; i < 6; i++) {
			num = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				while (num == arr[j]) {
					num = (int)(Math.random() * 45 + 1);
				}
			}
			arr[i] = num;
		}
		//���� ������ ����� �������� ����
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
		
		System.out.println("�ζ� ��ȣ : ");
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}

	}

}
