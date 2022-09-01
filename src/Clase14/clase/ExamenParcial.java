package Clase14.clase;

public class ExamenParcial extends Examen{
    private int numUnidad;
    private int nroIntentos;


    public ExamenParcial(String titulo , String enunciado , Alumno alumno , int numUnidad) {
        super(titulo , enunciado , alumno);
        this.numUnidad = numUnidad;
    }

    public ExamenParcial() {
        super();
    }


    public boolean puedeRecuperar(){
        if (this.numUnidad <= 3 && this.nroIntentos < 3) {
            return true;
        }
        return false;
    }

    public void recuperar(){
        this.nroIntentos++;
    }
    @Override
    public boolean estaAprobado() {
        return super.getNota()>=4;
    }


    @Override
    public String toString() {
        return super.toString() + "ExamenParcial{" +
                "numUnidad=" + numUnidad +
                ", nroIntentos=" + nroIntentos +
                '}';
    }
}
