package refactoringwithstatepattern.before;

public class Player {
	
	public static final int BEGINNER_LEVEL = 1;
	public static final int ADVANCED_LEVEL = 2;
	public static final int SUPER_LEVEL = 3;
	private int level;

	public Player() {
		level = BEGINNER_LEVEL;
		showLevelMessage();
	}
	
	public int getLevel() {
		return level;
	}
	
	public void upgradeLevel() {
		if(level == BEGINNER_LEVEL) {
			level = ADVANCED_LEVEL;
		}
		else if(level == ADVANCED_LEVEL) {
			level = SUPER_LEVEL;
		}
		else {
			System.out.println("not support level");
		}
		showLevelMessage();
	}
	
	private String showLevelMessage() {
		// TODO Auto-generated method stub
		return "���� ������ " + String.valueOf(level) + "�Դϴ�.";
		
	}

	public void play(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
	
	public void run() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("õõ�� �޸��ϴ�.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("���� �޸��ϴ�.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("��û ���� �޸��ϴ�.");
		}
		else {
			System.out.println("not support level");
		}
	}

	public void jump() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("Jump �� �� �𸨴ϴ�.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("���� jump �մϴ�.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("��û ���� jump �մϴ�.");
		}
		else {
			System.out.println("not support level");
		}
	}
	
	public void turn() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("turn �� �� �𸨴ϴ�.");
		}
		else if(level == ADVANCED_LEVEL) {
			System.out.println("turn �� �� �𸨴ϴ�.");
		}
		else if(level == SUPER_LEVEL) {
			System.out.println("�� ���� ���ϴ�.");
		}
		else {
			System.out.println("not support level");
		}
	}
}
