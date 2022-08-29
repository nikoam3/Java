package Clase11.ejemploPG;

public class main {
    public static void main(String[] args) {
        Animal animal = new Perro("colita", 6);
        animal.hacerRuido();
        animal = new Gato("Beto", 2);
        animal.hacerRuido();
    }
}
