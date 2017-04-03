package state;

public class ControlRemoto {

	public static void main(String[] args) {

		Context context = new Context();
		State on = new ONState();
		State off = new OFFState();
		
		context.setState(on);
		context.request();
		
		context.setState(off);
		context.request();

	}

}