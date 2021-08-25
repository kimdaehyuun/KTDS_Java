package exam;

public class Market {

	public static void main(String[] args) {
		Customer cusPark = new Customer();
		cusPark.setCustomerName("박새로이");
		cusPark.calcPrice(10000);
		System.out.println(cusPark.showCustomerInfo());
		System.out.println(cusPark.getCustomerName() + "님이 지불해야하는 금액은 " + cusPark.calcPrice(10000) + "원입니다." );
		
		VIPCustomer cusYoon = new VIPCustomer();
		cusYoon.setCustomerName("윤세리");
		cusYoon.calcPrice(10000);
		System.out.println(cusYoon.showCustomerInfo());
		System.out.println(cusYoon.getCustomerName() + "님이 지불해야하는 금액은 " + cusYoon.calcPrice(10000) + "원입니다." );

	}

}
