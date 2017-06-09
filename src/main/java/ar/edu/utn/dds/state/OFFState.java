package ar.edu.utn.dds.state;

public class OFFState implements State {

	@Override
	public void handle() {
		System.out.println("En STAND BY, entonces solo responde a la accion 'encender'");
	}

}