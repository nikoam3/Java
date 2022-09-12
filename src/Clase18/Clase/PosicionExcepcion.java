package Clase18.Clase;

public class PosicionExcepcion extends Exception{
    public PosicionExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Nombre " + getClass().getName() + "\n" + "Mensaje: " + getMessage();
    }
}
