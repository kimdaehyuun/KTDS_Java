package exam2;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) { //�¾ ������ �����ϴ� �޼ҵ�
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this); //this ���
	}
	
	public String toString() {
		return year + "�� " + month + "�� " + day + "��";
	}
}


public class ThisExample {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //������ 2000���� ����
		System.out.println(bDay); //�����������
		bDay.printThis();
	}

}
