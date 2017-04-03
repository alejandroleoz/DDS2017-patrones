package state;

public class ONState implements State {

	@Override
	public void handle() {
		System.out.println("Está ENCENDIDO, en este estado se pueden cambiar los canales, volumen, etc.");
	}
}