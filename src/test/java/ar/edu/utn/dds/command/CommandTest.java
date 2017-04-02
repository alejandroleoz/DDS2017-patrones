package ar.edu.utn.dds.command;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {

    private String textoLargo;
    private String textoMasLargo;
    private String deltaTexto;
    private Portapapeles portapapeles;

    @Before
    public void before() {
        this.textoLargo = "Este es un texto largo";
        this.textoMasLargo = "Este es un texto ahora mas largo";
        this.deltaTexto = "ahora mas ";
        this.portapapeles = new Portapapeles();
    }

    @Test
    public void copiarYPegarTest() {
        int posicion = textoLargo.indexOf("largo");
        StringBuffer destino = new StringBuffer(textoLargo);

        ComandoCopiar copiar = new ComandoCopiar(deltaTexto, portapapeles);
        copiar.ejecutar();

        ComandoPegar pegar = new ComandoPegar(destino, posicion, portapapeles);
        pegar.ejecutar();

        Assert.assertEquals("Texto despues de 'pegar'", textoMasLargo, destino.toString());

        pegar.deshacer();
        Assert.assertEquals("Texto despues de deshacer 'pegar' ", textoLargo, destino.toString());

        Assert.assertTrue("Clipboard con texto", portapapeles.getTexto().length() > 0);
        copiar.deshacer();
        Assert.assertTrue("Clipboard sin texto", portapapeles.getTexto().length() == 0);
    }

    @Test
    public void cortarTest() {
        StringBuffer origen = new StringBuffer(this.textoMasLargo);
        ComandoCortar cortar = new ComandoCortar(origen, this.deltaTexto, portapapeles);

        // ejecuto
        cortar.ejecutar();

        // testeo
        Assert.assertEquals(this.deltaTexto, portapapeles.getTexto());
        Assert.assertEquals(this.textoLargo, origen.toString());

        // undo
        cortar.deshacer();

        // testeo
        Assert.assertEquals(this.textoMasLargo, origen.toString());
    }

}
