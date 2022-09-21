package Clase21.Clase;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;
    public static final String CURSO="curso";
    public static final String PROGRAMA_INTENSIVO="programa";
    private OfertaAcademicaFactory(){}

    public static OfertaAcademicaFactory getInstance(){
        if (instancia == null) {
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo, String nombre, String descripcion){
        switch (codigo){
            case "curso":
                return new Curso(nombre, descripcion);
            case "programa":
                return new ProgramaIntensivo(nombre, descripcion);
        }
        return null;
    }
}
