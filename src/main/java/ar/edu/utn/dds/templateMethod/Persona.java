package ar.edu.utn.dds.templateMethod;

public abstract class Persona {
    private String nombre;
    private String DNI;

    // Define el esquelo del algoritmo y luego las
    // subclases deben implementar los m�todos:
    // getIdentificacion y getTipoId()
    public String identificate() {
        String frase = "Me identifico con: ";
        frase = frase + getTipoId();
        frase = frase + ". El numero es: ";
        frase = frase + getIdentificacion();
        return frase;
    }


    protected abstract String getIdentificacion();

    protected abstract String getTipoId();

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dni) {
        DNI = dni;
    }
}