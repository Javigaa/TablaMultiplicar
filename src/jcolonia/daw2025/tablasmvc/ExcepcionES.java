package jcolonia.daw2025.tablasmvc;

/**
 * Excepción personalizada para gestionar errores de entrada de datos 
 * o problemas con la lógica de las tablas.
 */
public class ExcepcionES extends Exception {
    private static final long serialVersionUID = 1L;

    public ExcepcionES(String mensaje) {
        super(mensaje);
    }

    public ExcepcionES(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}