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
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	protected void jump() {
		System.out.println("���� jump �մϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("turn �� �� �𸨴ϴ�.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("*** �߱��� ���� �Դϴ�. ***");
	}

}
