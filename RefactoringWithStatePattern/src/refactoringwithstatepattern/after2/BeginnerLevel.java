package refactoringwithstatepattern.after2;

public class BeginnerLevel extends PlayerLevel{
	
	private static BeginnerLevel instance = new BeginnerLevel();
	
	private BeginnerLevel() {}
	
	public static BeginnerLevel getInstance() {
		if( instance == null ) {
			instance = new BeginnerLevel();
		}
		return instance;
	}

	@Override
	protected void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	protected void jump() {
		System.out.println("Jump �� �� �𸨴ϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("turn �� �� �𸨴ϴ�.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("*** �ʱ��� ���� �Դϴ�. ***");
	}

}
