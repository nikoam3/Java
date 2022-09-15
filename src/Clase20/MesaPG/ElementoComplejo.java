package Clase20.MesaPG;

import java.util.ArrayList;

public class ElementoComplejo{
    private ArrayList<Figura> figuras;

    public ElementoComplejo() {
        this.figuras = new ArrayList<>();
    }

    public void agregar(Figura figura){
        figuras.add(figura);
    }

    public double superficieTotal(){
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }
}
