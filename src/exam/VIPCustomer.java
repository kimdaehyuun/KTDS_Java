package exam;

public class VIPCustomer extends Customer {
	double saleRatio;

	public VIPCustomer() {
		super();
		customerGrade = "VIP"; //고객 등급 VIP
		bonusRatio = 0.05; //VIP 포인트 적립비율
		saleRatio = 0.1; //할인율 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //포인트 계산
		return price - (int)(price * saleRatio); //할인율 적용
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."; 
	}


}
