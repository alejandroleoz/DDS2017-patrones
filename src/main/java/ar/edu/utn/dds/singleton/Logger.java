package ar.edu.utn.dds.singleton;

public class Logger {

    private static Logger log;
    private String value;

    // El constructor es privado para que no puedan crear instancias fuera de esta clase
    private Logger() {
    }

    // Acceso publico y estatico
    public static Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    public void log(String msg) {
        System.out.println(msg);
    }

    public void setValue(String msg) {
        value = msg;
    }

    public String getValue() {
        return value;
    }
}
