package ar.edu.utn.dds.command;

public class ComandoPegar implements Comando {

    private StringBuffer destino;
    private int posicion;
    private String textoAPegar;

    public ComandoPegar(StringBuffer destino, int posicion, Portapapeles portapapeles) {
        this.destino = destino;
        this.posicion = posicion;
        this.textoAPegar = portapapeles.getTexto();
    }

    public void ejecutar() {
        destino.insert(posicion, textoAPegar);
    }

    public void deshacer() {
        destino.replace(posicion, posicion + textoAPegar.length(), "");
    }
}
