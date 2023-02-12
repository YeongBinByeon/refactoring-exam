package refactoringwithstatepattern.after;

public class BeginnerLevel extends PlayerLevel{

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
