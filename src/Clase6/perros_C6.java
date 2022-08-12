package Clase6;

public class perros_C6 {
    /*Objetivo
    Identificar, modelar e implementar en Java la clase involucrada en el enunciado
    especificando sus atributos, responsabilidades, al menos dos constructores y los
    correspondientes getters, y setters.
    Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
    no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
    nombre de pila que le asignaron en la institución.
    Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
    —entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
    lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.*/

    private String raza;
    private String anioNacimiento;
    private String nombre;
    private double peso;
    private boolean adopcion;
    private boolean chip;
    private boolean lastimado;

    public perros_C6(String raza , String anioNacimiento , String nombre , double peso , boolean adopcion , boolean chip , boolean lastimado) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
        this.peso = peso;
        this.adopcion = adopcion;
        this.chip = chip;
        this.lastimado = lastimado;
    }
    public perros_C6(){}

    public String getAnioNacimiento() {
        return anioNacimiento;
    }
    public boolean sePierde(){
        return !chip;
    }

    public void setAdopcion(boolean adopcion) {
        if(!lastimado && peso>5){
            this.adopcion = adopcion;
        }
    }

    @Override
    public String toString() {
        return "Clase6.perros_C6{" +
                "raza='" + raza + '\'' +
                ", anioNacimiento='" + anioNacimiento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", adopcion=" + adopcion +
                ", chip=" + chip +
                ", lastimado=" + lastimado +
                '}';
    }
}
