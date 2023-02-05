package magicnumber.after;

public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("James");
		
		// 해결 1 : 코드만 봤을 때 0, 1, 2와 같은 숫자가 있을때 보다 더 코드를 이해하기 쉬움
		
		robot.order(Robot.Command.WALK); // work
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
		
		// 해결 2 : 지원하지 않는 기능의 잘못 입력 시 컴파일 단계에서 문제 발견 됨
		//robot.order(Command.XXX); // 


	}

}