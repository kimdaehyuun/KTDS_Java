package exam;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("우선순위가 높은 상담 전화를 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("등급이 높은 고객의 전화를 우선 가져와서 업무 능력이 좋은 상담원에게 우선 배분합니다.");
	}
	

}
