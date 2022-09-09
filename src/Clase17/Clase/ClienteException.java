package Clase17.Clase;

public class ClienteException extends Exception{

    public ClienteException(String message) {
        super(message);
    }

    public String toString(){
        return "Nombre: " + this.getClass().getName() + "\n" + "Mensaje " + this.getMessage();
    }
}
