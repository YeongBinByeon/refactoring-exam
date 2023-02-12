package refactoringwithstatepattern.after2;

public class Player {

	private PlayerLevel playerLevel;

	public Player() {
		playerLevel = BeginnerLevel.getInstance();
		playerLevel.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return playerLevel;
	}
	
	public void upgradeLevel() {
		if(playerLevel instanceof BeginnerLevel) {
			playerLevel = AdvancedLevel.getInstance();
		}
		else if(playerLevel instanceof AdvancedLevel) {
			playerLevel = SuperLevel.getInstance();
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