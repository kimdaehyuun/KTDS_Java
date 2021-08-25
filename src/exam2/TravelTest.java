package exam2;

import java.util.List;
import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("����", 35, 100);
		TravelCustomer customerKim = new TravelCustomer("Ȳ���", 32, 100);
		TravelCustomer customerHong = new TravelCustomer("���ʱ�", 8, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("== �� ��� ������� ��� ==");
		//map() ����Ͽ� ���� �̸��� ��������, forEach()�� �̸� ���
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		//���� ������ ����� �����ͼ� mapToInt()�� ���� ������ ��ȯ�� �� sum()���� ���� ����
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ���� ����� :" + total + "�Դϴ�");
		
		System.out.println("== 20�� �̻� �� ��� �����Ͽ� ��� ==");
		//filter()�� ����Ͽ� 20�� �̻� ����, map()���� �̸� ��������, sorted()�� �̸��� ���� => �߰�����
		//�������� forEach()�� Ȱ���Ͽ� ���
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
