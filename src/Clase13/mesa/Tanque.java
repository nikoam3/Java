package Clase13.mesa;

public class Tanque extends SistemaArmas implements FuncionesRobot{
    public Tanque(Integer energia) {
        super(energia);
    }

    @Override
    public Integer getEnergia() {
        return super.getEnergia();
    }

    @Override
    public void setEnergia(Integer energia) {
        super.setEnergia(energia);
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }

    @Override
    public void atacar() {
        super.atacar();
    }

    @Override
    public void defender() {
        super.defender();
    }
}
