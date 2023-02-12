package refactoringwithstatepattern.after2;

public class SuperLevel extends PlayerLevel{

	private static SuperLevel instance = new SuperLevel();
	
	private SuperLevel() {}
	
	public static SuperLevel getInstance() {
		if( instance == null ) {
			instance = new SuperLevel();
		}
		return instance;
	}
	
	@Override
	protected void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	protected void jump() {
		System.out.println("��û ���� jump �մϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("*** ����� ���� �Դϴ�. ***");
	}

}
