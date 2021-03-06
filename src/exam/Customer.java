package exam;

public class Customer {
	protected int customerID; //고객아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급
	int bonusPoint; //보너스포인트
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER"; //기본 등급
		bonusRatio = 0.01; //포인트 기본적립비율
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다."; 
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


}
