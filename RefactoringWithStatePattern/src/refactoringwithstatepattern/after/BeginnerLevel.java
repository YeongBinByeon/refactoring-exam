package refactoringwithstatepattern.after;

public class BeginnerLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("Jump 할 줄 모릅니다.");
	}

	@Override
	protected void turn() {
		System.out.println("turn 할 줄 모릅니다.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("*** 초급자 래벨 입니다. ***");
	}

}
