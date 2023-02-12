package refactoringwithstatepattern.after2;

public class AdvancedLevel extends PlayerLevel{

	private static AdvancedLevel instance = new AdvancedLevel();
	
	private AdvancedLevel() {}
	
	public static AdvancedLevel getInstance() {
		if( instance == null ) {
			instance = new AdvancedLevel();
		}
		return instance;
	}
	
	@Override
	protected void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("높이 jump 합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("turn 할 줄 모릅니다.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("*** 중급자 래벨 입니다. ***");
	}

}
