package magicnumber.before;

public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("James");
		
		// ���� 1 : �ڵ常 ���� �� 0, 1, 2�� ���� ���ڰ� ������ �ǹ��ϴ��� �� �� ����.
		
		robot.order(0); // work
		robot.order(1);
		robot.order(2);
		
		// ���� 2 : �������� �ʴ� ����� ���� �Է� �� ������ �ܰ迡�� �߰� ���ϰ� ��Ÿ�� �ܰ迡�� �߰ߵ�
		robot.order(100); // 


	}

}
