package Clase14.clase;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal>{
    private double notaOral;
    private String descripcion;

    public ExamenFinal(){
        super();
    }
    public ExamenFinal(String titulo , String enunciado , Alumno alumno , String descripcion) {
        super(titulo , enunciado , alumno);
        this.descripcion = descripcion;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public double promedio(){
        return (super.getNota() + this.notaOral) / 2;
    }

    @Override
    public boolean estaAprobado() {
        return super.getNota() >= 4 && this.notaOral >= 4;
    }

    @Override
    public int compareTo(ExamenFinal o) {
        return (int) (this.promedio() - o.promedio());
    }

    @Override
    public String toString() {
        return super.toString() + "ExamenFinal{" +
                "notaOral=" + notaOral +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
