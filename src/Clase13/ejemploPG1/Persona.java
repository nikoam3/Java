package Clase13.ejemploPG1;

public class Persona implements Comparable{
    private int edad;
    private String nombre;
    private String apellido;

    public Persona(int edad , String nombre , String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getEdad(){
        return this.edad;
    }

    public void decirEdad(){
        System.out.println(this.edad);
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        /*
        if (this.edad > p.getEdad()){
            return 1;
        } else if (this.edad < p.getEdad()){
            return -1;
        }else{
            return 0;
        }
*/
        //o la mejor forma es
        return this.edad - p.getEdad();
    }
}
