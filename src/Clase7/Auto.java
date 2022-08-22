package Clase7;

public class Auto {
    private String marca;
    private String modelo;
    private String patente;
    private Motor motor;

    public Auto(String marca , String modelo , String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        motor = new Motor();
    }

    public String getPatente(){
        return patente;
    }
}
