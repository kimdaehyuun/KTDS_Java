package exam;

public class VIPCustomer extends Customer {
	double saleRatio;

	public VIPCustomer() {
		super();
		customerGrade = "VIP"; //�� ��� VIP
		bonusRatio = 0.05; //VIP ����Ʈ ��������
		saleRatio = 0.1; //������ 10%
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //����Ʈ ���
		return price - (int)(price * saleRatio); //������ ����
	}
	
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�."; 
	}


}
