package ar.edu.utn.dds.proxy;

/**
 * Esta es la clase Proxy
 */
public class EmpleadoProxy implements IEmpleado {

    private IEmpleado empleado;
    private boolean estaAutorizado;

    public EmpleadoProxy(IEmpleado empleado) {
        this.empleado = empleado;
    }

    public void setEstaAutorizado(boolean estaAutorizado) {
        this.estaAutorizado = estaAutorizado;
    }

    public double getSueldo() {

        // chequeo permisos
        if (this.chequeoComplejoDeAutorizacion()) {
            // tiene permisos -> devuelvo sueldo (delego en el empleado concreto)
            return this.empleado.getSueldo();
        } else {
            // no tiene permisos -> lanzo exception
            throw new NoAutorizadoException("No esta autorizado para mostrar el sueldo");
        }

    }

    private boolean chequeoComplejoDeAutorizacion() {
        return estaAutorizado;
    }

}
