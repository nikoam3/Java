package Clase21.Clase;

public class main {
    public static void cargarDatosCursos(Curso c, int carga, int meses, double precio){
        c.setCargaHoraria(carga);
        c.setMesesDuracion(meses);
        c.setPrecioHora(precio);
    }

    public static void main(String[] args) {
        OfertaAcademicaFactory ofertaAcademicaFactory=OfertaAcademicaFactory.getInstance();
        Instituto instituto = new Instituto("DH");
        Curso curso1 = (Curso) ofertaAcademicaFactory.crearOfertaAcademica(OfertaAcademicaFactory.CURSO, "Front End", "Lorem");
        cargarDatosCursos(curso1, 16, 2, 1000);
        Curso curso2 = (Curso) ofertaAcademicaFactory.crearOfertaAcademica(OfertaAcademicaFactory.CURSO, "Back End", "Lorem");
        cargarDatosCursos(curso2, 20, 2, 900);

        ProgramaIntensivo programa = (ProgramaIntensivo) ofertaAcademicaFactory.crearOfertaAcademica(OfertaAcademicaFactory.PROGRAMA_INTENSIVO, "Full Stack", "Lorem");
        programa.setDescuento(20.0);
        programa.agregarCurso(curso1);
        programa.agregarCurso(curso2);

        instituto.agregarOferta(curso1);
        instituto.agregarOferta(curso2);
        instituto.agregarOferta(programa);
        System.out.println(instituto.generarInforme());
    }
}
