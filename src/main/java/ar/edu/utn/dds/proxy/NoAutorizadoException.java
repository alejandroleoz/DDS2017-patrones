package ar.edu.utn.dds.proxy;

public class NoAutorizadoException extends RuntimeException {

    public NoAutorizadoException(String message) {
        super(message);
    }
}
