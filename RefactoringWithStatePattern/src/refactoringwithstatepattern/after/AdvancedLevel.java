package refactoringwithstatepattern.after;

public class AdvancedLevel extends PlayerLevel{

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
