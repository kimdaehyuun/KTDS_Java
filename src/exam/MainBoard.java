package exam;

public class MainBoard {

	public static void main(String[] args) {
		// 맨 처음에는 비기너 레벨로 시작
		Player player = new Player();
		player.play(1);
		
		// 다음은 향상된 레벨로 변경
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		// 다음은 수퍼 레벨로 변경
		SuperLevel bLevel = new SuperLevel();
		player.upgradeLevel(bLevel);
		player.play(3);

	}

}
