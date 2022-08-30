package Clase13.ejemploPG;

public class Doberman implements Ladrador, Cuidador {
    @Override
    public String custodiar(){
        return "estoy atento custodiando la casa";
    }
    @Override
    public String ladrar(){
        return "Guau!";
    }
}
