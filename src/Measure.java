
public class Measure {
	int a;
	int b;

	public int getA() {
		return a;
	}



	public void setA(int a) {
		int sumA = 0;
		// �ڱ��ڽ��� ������ ����� ���� ���Ѵ�
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sumA += i;
			}
		}
		// a�� �ԷµǸ� a�� ����� ���� �������ش�.
		this.a = sumA;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		int sumB = 0;
		// �ڱ��ڽ��� ������ ����� ���� ���Ѵ�
		for (int i = 1; i < a; i++) {
			if (b % i == 0) {
				sumB += i;
			}
		}
		// b�� �ԷµǸ� b�� ����� ���� �������ش�.
		this.b = sumB;
	}

}