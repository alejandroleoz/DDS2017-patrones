package ar.edu.utn.dds.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProxyTest {

    private static final double DELTA = 1e-15;
    private double expectedSueldo;
    private IEmpleado empleadoConcreto;
    private EmpleadoProxy empleadoProxy;

    @Before
    public void before() throws NoSuchFieldException {
        this.expectedSueldo = 20000;
        this.empleadoConcreto = new Empleado();
        this.empleadoProxy = new EmpleadoProxy(empleadoConcreto);
    }

    @Test
    public void testAutorizado() throws NoSuchFieldException, IllegalAccessException {
        this.empleadoProxy.setEstaAutorizado(true);
        Assert.assertEquals("Sueldo visible", expectedSueldo, empleadoProxy.getSueldo(), DELTA);
    }

    @Test(expected = NoAutorizadoException.class)
    public void testNoAutorizado() throws NoSuchFieldException, IllegalAccessException {
        this.empleadoProxy.setEstaAutorizado(false);
        empleadoProxy.getSueldo();
    }
}
