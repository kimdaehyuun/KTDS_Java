package exam;

public class Player {
	private PlayerLevel level;
	
	public Player(){
		// 맨 처음에 실행하면 일단 비기너 레벨로 시작
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
