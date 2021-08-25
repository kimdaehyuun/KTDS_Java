
public class Measure {
	int a;
	int b;

	public int getA() {
		return a;
	}



	public void setA(int a) {
		int sumA = 0;
		// 자기자신을 제외한 약수의 합을 구한다
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sumA += i;
			}
		}
		// a가 입력되면 a의 약수의 합을 리턴해준다.
		this.a = sumA;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		int sumB = 0;
		// 자기자신을 제외한 약수의 합을 구한다
		for (int i = 1; i < a; i++) {
			if (b % i == 0) {
				sumB += i;
			}
		}
		// b가 입력되면 b의 약수의 합을 리턴해준다.
		this.b = sumB;
	}

}