package state;

public class Context {

	private State tvState;

	public void setState(State state) {
		tvState = state;
	}

	public State getState() {
		return tvState;
	}

	public void request() {
		tvState.handle();
	}
	
}