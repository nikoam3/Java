package Clase17.MesaPG;

public class PacienteException extends Exception{

    public PacienteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getClass().getName() + " Mensaje: " + this.getMessage() ;
    }
}
