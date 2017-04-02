package ar.edu.utn.dds.composite;

public class Archivo implements Elemento {

    private String nombre;
    private long tamano;

    public Archivo(String nombre, long tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTamano() {
        return this.tamano;
    }

    public String listar() {
        return "[File] '" + this.getNombre() + "' - " + this.getTamano() + " KB";
    }
}
