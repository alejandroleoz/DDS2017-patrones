package ar.edu.utn.dds.templateMethod;

public class Cliente extends Persona {
    private int numeroDeCliente;

    public Cliente(int numeroDeCliente) {
        setNumeroDeCliente(numeroDeCliente);
    }

    protected String getIdentificacion() {
        return String.valueOf(numeroDeCliente);
    }

    protected String getTipoId() {
        return "numero de cliente";
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }
}