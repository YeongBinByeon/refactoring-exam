package magicnumber.before;

public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("James");
		
		// 문제 1 : 코드만 봤을 때 0, 1, 2와 같은 숫자가 무엇을 의미하는지 알 수 없음.
		
		robot.order(0); // work
		robot.order(1);
		robot.order(2);
		
		// 문제 2 : 지원하지 않는 기능의 숫자 입력 시 컴파일 단계에서 발견 못하고 런타임 단계에서 발견됨
		robot.order(100); // 


	}

}
