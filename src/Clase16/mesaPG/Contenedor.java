package Clase16.mesaPG;

public class Contenedor implements Comparable<Contenedor> {
    private int id;
    private String pais;
    private boolean materialPeligroso;

    public Contenedor(int id , String pais , boolean materialPeligroso) {
        this.id = id;
        this.pais = pais;
        this.materialPeligroso = materialPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "id=" + id +
                ", pais='" + pais + '\'' +
                '}';
    }

    public String getPais() {
        return pais;
    }

    public boolean isMaterialPeligroso() {
        return materialPeligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        return this.id - o.id;
    }
}
