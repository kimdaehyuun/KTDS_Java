package exam;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�켱������ ���� ��� ��ȭ�� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����� ���� ���� ��ȭ�� �켱 �����ͼ� ���� �ɷ��� ���� �������� �켱 ����մϴ�.");
	}
	

}
