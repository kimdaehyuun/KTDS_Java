package exam2;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberKim = new Member(1005, "�����");
		
		//ArrayList�� ȸ���߰�
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
//		memberArrayList.showAllMember();
//		
//		memberArrayList.removeMember(memberHong.getMemberId());
//		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(memberKim, 3);
		memberArrayList.showAllMember();
	}

}
