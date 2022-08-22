package Clase7;

public class main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("DHEditorial");
        Revista revista = new Revista("NoticiasDH", 1234, "Semanal");

        editorial.agregarRevista(revista);


        // ejemplo auto chofer
        Chofer chofer = new Chofer("Nico", "Amaya", new Auto("Chevrolet", "Onix", "NYF123"));
        Auto auto = new Auto("ford", "ka", "JNS123");
        Chofer chofer1 = new Chofer("Agos", "Comello",auto);
        System.out.println(chofer.verPatente());
        System.out.println(chofer1.verPatente());

    }
}
