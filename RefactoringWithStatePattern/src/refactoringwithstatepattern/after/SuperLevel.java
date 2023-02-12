package refactoringwithstatepattern.after;

public class SuperLevel extends PlayerLevel{

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
