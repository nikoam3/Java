import java.util.Scanner;

public class C3 {
    /*Desafío 1
Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
cuando el primero elije “*” como indicador de final.*/

    public static String cualGana(String gamer1, String gamer2){
        Scanner scanner = new Scanner(System.in);
        String objeto1, objeto2, fin;
        int puntos1=0, puntos2=0;
        boolean finJuego = true;

        while (finJuego){
            System.out.println(gamer1 + " ingresá el objeto:");
            objeto1 = scanner.nextLine();
            System.out.println(gamer2 + " ingresá el objeto:");
            objeto2 = scanner.nextLine();

            switch (objeto1){
                case "priedra":
                    if (objeto2.equals("tijera")){
                        puntos1++;
                    } else if (objeto2.equals("papel")) {
                        puntos2++;
                    }break;
                case "tijera":
                    if (objeto2.equals("papel")){
                        puntos1++;
                    } else if (objeto2.equals("piedra")) {
                        puntos2++;
                    }break;
                case "papel":
                    if (objeto2.equals("piedra")){
                        puntos1++;
                    } else if (objeto2.equals("tijera")) {
                        puntos2++;
                    }break;
            }
            System.out.println("Si desea salir, presione * ");
            fin = scanner.nextLine();
            if (fin.equals("*")){
                finJuego=false;
            }
        }
        if (puntos1 > puntos2){
            return gamer1;
        }
        else{
            return gamer2;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String gamer1, gamer2, ganador;
        System.out.println("Ingrese nombre jugador 1");
        gamer1 = scanner.nextLine();
        System.out.println("Ingrese nombre jugador 2");
        gamer2 = scanner.nextLine();

        ganador = cualGana(gamer1, gamer2);
        System.out.println("El ganador es " + ganador);
    }
}
