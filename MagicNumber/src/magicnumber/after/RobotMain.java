package magicnumber.after;

public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("James");
		
		// �ذ� 1 : �ڵ常 ���� �� 0, 1, 2�� ���� ���ڰ� ������ ���� �� �ڵ带 �����ϱ� ����
		
		robot.order(Robot.Command.WALK); // work
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
		
		// �ذ� 2 : �������� �ʴ� ����� �߸� �Է� �� ������ �ܰ迡�� ���� �߰� ��
		//robot.order(Command.XXX); // 


	}

}