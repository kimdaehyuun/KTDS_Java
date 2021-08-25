package exam;

public class Player {
	private PlayerLevel level;
	
	public Player(){
		// �� ó���� �����ϸ� �ϴ� ���� ������ ����
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count){
		level.go(count);
	}

}
