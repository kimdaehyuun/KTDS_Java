package exam;

public class Market {

	public static void main(String[] args) {
		Customer cusPark = new Customer();
		cusPark.setCustomerName("�ڻ�����");
		cusPark.calcPrice(10000);
		System.out.println(cusPark.showCustomerInfo());
		System.out.println(cusPark.getCustomerName() + "���� �����ؾ��ϴ� �ݾ��� " + cusPark.calcPrice(10000) + "���Դϴ�." );
		
		VIPCustomer cusYoon = new VIPCustomer();
		cusYoon.setCustomerName("������");
		cusYoon.calcPrice(10000);
		System.out.println(cusYoon.showCustomerInfo());
		System.out.println(cusYoon.getCustomerName() + "���� �����ؾ��ϴ� �ݾ��� " + cusYoon.calcPrice(10000) + "���Դϴ�." );

	}

}
