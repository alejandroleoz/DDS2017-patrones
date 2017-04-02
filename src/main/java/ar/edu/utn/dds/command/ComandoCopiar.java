package ar.edu.utn.dds.command;

public class ComandoCopiar implements Comando {

    private final Portapapeles portapapeles;
    private String texto;

    public ComandoCopiar(String texto, Portapapeles clipboard) {
        this.texto = texto;
        this.portapapeles = clipboard;
    }

    public void ejecutar() {
        this.portapapeles.setTexto(texto);
    }

    public void deshacer() {
        this.portapapeles.setTexto("");
    }
}
