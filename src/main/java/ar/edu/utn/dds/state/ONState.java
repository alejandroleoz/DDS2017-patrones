package ar.edu.utn.dds.state;

public class ONState implements State {

	@Override
	public void handle() {
		System.out.println("Esta ENCENDIDO, en este estado se pueden cambiar los canales, volumen, etc.");
	}
}