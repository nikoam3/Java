package Clase10.ejemploClase;

public class SocioHabilitado extends Socio{
    private Double costoPileta;
    private Boolean habilitado;

    public SocioHabilitado(String numeroSocio , String nombre , Double cuotaMensual , String actividad , Double costoPileta , Boolean habilitado) {
        super(numeroSocio , nombre , cuotaMensual , actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }
    public SocioHabilitado(){
        super();
    }

    @Override //sobreescribir
    public Double calcularCuotaMensual() {
        return getCuotaMensual() + this.costoPileta;
    }

    @Override
    public String toString() {
        return "Socio: " + super.toString() + "\nSocioHabilitado: {" +
                "costoPileta=" + costoPileta +
                ", habilitado=" + habilitado +
                '}';
    }
}
