package Clase20.MesaPG;

public class main {
    public static void main(String[] args) {
        Figura rect = new Rectangulo(5,4);
        Figura circ1 = new Circulo(1);
        Figura circ2 = new Circulo(1);
        Figura circ3 = new Circulo(1);

        ElementoComplejo vagon = new ElementoComplejo();
        vagon.agregar(rect);
        vagon.agregar(circ1);
        vagon.agregar(circ2);
        vagon.agregar(circ3);

        System.out.println(vagon.superficieTotal());

    }
}
