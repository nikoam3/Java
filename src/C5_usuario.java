public class C5_usuario {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    public C5_usuario(String nombre , String clave) {
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;
    }

    public void aumentarPuntaje(){
        puntaje++;
    }

    public void subirNivel(){
        nivel++;
    }

    public void bonus(int valor){
        puntaje += valor;
    }

    @Override
    public String toString() {
        return "C5_usuario{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", puntaje=" + puntaje +
                ", nivel=" + nivel +
                '}';
    }
}
