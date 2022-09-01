package Clase14.clase;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private double nota;
    private Alumno alumno;

    public Examen(){};

    public Examen(String titulo , String enunciado , Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.alumno = alumno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public abstract boolean estaAprobado();

    @Override
    public String toString() {
        return "Examen{" +
                "titulo='" + titulo + '\'' +
                ", enunciado='" + enunciado + '\'' +
                ", nota=" + nota +
                ", alumno=" + alumno +
                '}';
    }
}
