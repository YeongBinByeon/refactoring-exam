package magicnumber.after;

public class Robot {
	
	public String name;
	
	public enum Command{
		WALK, STOP, JUMP
	}
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void order(Command command) {
		if(command == Command.WALK) { // ∞»±‚
			System.out.println(name + " walk");
		}
		else if(command == Command.STOP) { // ∏ÿ√ﬂ±‚
			System.out.println(name + " stop");
		}
		else if(command == Command.JUMP) { // ¡°«¡
			System.out.println(name + " jump");
		}
		else {
			System.out.println("error");
		}
	}

}