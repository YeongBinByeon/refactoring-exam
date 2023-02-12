package refactoringwithstatepattern.after;

public class SuperLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("엄청 높게 jump 합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("*** 고급자 래벨 입니다. ***");
	}

}
