package ar.edu.utn.dds.composite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompositeTest {

    private Archivo archivo1;
    private Archivo archivo2;
    private Archivo archivo3;
    private Directorio directorio1;
    private Directorio directorio2;
    private Directorio root;

    @Before
    public void setup() {
        this.root = new Directorio("/");
        this.directorio1 = new Directorio("usuario");
        this.directorio2 = new Directorio("tmp");

        this.root.agregarElemento(directorio1);
        this.root.agregarElemento(directorio2);

        this.archivo1 = new Archivo("prueba.txt", 50);
        this.archivo2 = new Archivo("Archivo de usuario.txt", 200);
        this.archivo3 = new Archivo(".important", 30);

        this.directorio2.agregarElemento(archivo1);
        this.directorio1.agregarElemento(archivo2);
        this.root.agregarElemento(archivo3);
    }

    @Test
    public void testTamanosBajoRoot() {
        Assert.assertEquals("Tamaño del directorio 'usuario'", 200, this.directorio1.getTamano());
        Assert.assertEquals("Tamaño del directorio 'tmp'", 50, this.directorio2.getTamano());
    }

    @Test
    public void testTamanoRoot() {
        Assert.assertEquals("Tamaño del directorio 'root'", 280, this.root.getTamano());
    }

    @Test
    public void listar() {

        // OJO! Esto NO es un test !!
        System.out.println(this.root.listar());
    }

}
