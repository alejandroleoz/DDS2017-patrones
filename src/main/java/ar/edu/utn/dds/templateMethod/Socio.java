package ar.edu.utn.dds.templateMethod;

public class Socio extends Persona {
    private int numeroDeSocio;

    public Socio(int numeroDeSocio) {
        setNumeroDeSocio(numeroDeSocio);
    }

    protected String getIdentificacion() {
        return String.valueOf(numeroDeSocio);
    }

    protected String getTipoId() {
        return "numero de socio";
    }

    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }
}