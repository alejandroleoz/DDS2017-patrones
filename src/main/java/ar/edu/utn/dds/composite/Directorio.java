package ar.edu.utn.dds.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements Elemento {

    private String nombre;
    private List<Elemento> elementos = new ArrayList<Elemento>();

    public Directorio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    public void removerElemento(Elemento elemento) {
        this.elementos.remove(elemento);
    }

    public long getTamano() {
        long tamano = 0;

        // Sumo el tamano de cada uno de los elementos (archivos / directorios)
        for (Elemento elemento : this.elementos) {
            tamano += elemento.getTamano();
        }
        return tamano;
    }

    public String listar() {
        StringBuffer buffer = new StringBuffer();

        // listo nombre del directorio
        buffer.append(this.getListInfo());

        // listo cada uno de los elementos de este directorio
        for (Elemento elemento : this.elementos) {
            buffer.append("\t");
            buffer.append(elemento.listar());
            buffer.append("\n");
        }
        return buffer.toString();
    }

    private String getListInfo() {
        return "[Dir] '" + this.getNombre() + "' \n";
    }
}
