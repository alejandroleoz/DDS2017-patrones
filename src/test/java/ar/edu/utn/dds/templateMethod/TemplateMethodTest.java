package ar.edu.utn.dds.templateMethod;

import org.junit.Assert;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void test() {

        // parametros
        int  nroCliente = 981;
        String codEmpleado = "AR-122";
        int nroSocio = 111;

        // Expected strings
        String expectedCliente = "Me identifico con: numero de cliente. El numero es: " + String.valueOf(nroCliente);
        String expectedEmpleado = "Me identifico con: numero de legajo. El numero es: " + codEmpleado;
        String expectedSocio = "Me identifico con: numero de socio. El numero es: " + String.valueOf(nroSocio);

        Persona p = new Cliente(nroCliente);
        Assert.assertEquals(expectedCliente, p.identificate());

        p = new Empleado(codEmpleado);
        Assert.assertEquals(expectedEmpleado, p.identificate());

        p = new Socio(nroSocio);
        Assert.assertEquals(expectedSocio, p.identificate());
    }
}