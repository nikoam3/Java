package Clase13.mesa;

public class SistemaArmas implements FuncionesRobot{
    private Integer energia;

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }
    public void mostrar(){
        System.out.println("Se esta mostrando");
    }

    @Override
    public void atacar() {
        System.out.println("Está atacando");
    }

    @Override
    public void defender() {
        System.out.println("Está defendiendo");
    }

    @Override
    public void volar() {
        System.out.println("Está volando");
    }
}
