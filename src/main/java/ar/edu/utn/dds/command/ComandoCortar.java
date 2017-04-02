package ar.edu.utn.dds.command;

public class ComandoCortar implements Comando {

    private StringBuffer origen;
    private String textoACortar;
    private int posicionInicial;
    private ComandoCopiar copiar;

    public ComandoCortar(StringBuffer origen, String textoACortar, Portapapeles portapapeles) {
        this.origen = origen;
        this.textoACortar = textoACortar;

        this.posicionInicial = origen.indexOf(textoACortar);
        this.copiar = new ComandoCopiar(textoACortar, portapapeles);
    }

    public void ejecutar() {
        this.origen.replace(posicionInicial, posicionInicial + textoACortar.length(), "");
        this.copiar.ejecutar();
    }

    public void deshacer() {
        this.copiar.deshacer();
        this.origen.insert(posicionInicial, textoACortar);
    }
}
