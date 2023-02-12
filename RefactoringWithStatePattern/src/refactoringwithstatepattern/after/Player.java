package refactoringwithstatepattern.after;

public class Player {

	private PlayerLevel playerLevel;

	public Player() {
		playerLevel = new BeginnerLevel();
		playerLevel.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return playerLevel;
	}
	
	public void upgradeLevel() {
		if(playerLevel instanceof BeginnerLevel) {
			playerLevel = new AdvancedLevel();
		}
		else if(playerLevel instanceof AdvancedLevel) {
			playerLevel = new SuperLevel();
		}
		else {
			System.out.println("not support level");
		}
		playerLevel.showLevelMessage();
	}
	
	public void play(int count) {
		playerLevel.go(count);
	}
}