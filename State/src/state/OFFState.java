package state;

public class OFFState implements State {

	@Override
	public void handle() {
		System.out.println("En STAND BY, entonces sólo responde a la acción 'encender'");
	}

}