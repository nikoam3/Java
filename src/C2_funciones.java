import java.util.Scanner;

public class C2_funciones {
    public static boolean primo(int num){
        int acum=0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                acum++;
            }
        }
        if (acum <= 2){
            return true;
        }else{
            return false;
        }
    }

    public static double mayor(double valor1, double valor2,double valor3){
        double max = valor1;
        if(max < valor2){
            max = valor2;
        }if (max < valor3) {
            max = valor3;
        }
        return max;
    }
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        if(unTextoA.equals(unTextoB)) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        /*Ejercicio 1
        Hacer una función que dado un número indica si es un número primo o no. Un número primo es aquel que solo puede dividirse entre
        1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1
        y por 17.
        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la función desarrollada para comprobar
        si es primo o no. Para resolverlo usar la función obtenida en el ejercicio desarrollado en la clase asincrónica.
        boolean esDivisible(int n, int divisor)
        */
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero primo:");
        num = scanner.nextInt();
        if(primo(num)){
            System.out.println("El numero ingresado es primo");
        }else{
            System.out.println("El numero ingresado no es primo");
        }

        /*Ejercicio 2
        Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
                Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
        Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre el resultado.
        */
        double valor1,valor2,valor3, resultado;
        System.out.println("Ingrese 3 valores:");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        valor3 = scanner.nextInt();
        resultado = mayor(valor1,valor2,valor3);
        System.out.println("El numero mayor ingresado es " + resultado);

        /*
        Ejercicio 3
        Escribir una función:
        boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
        que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
        false, en caso de que coincidan.
        */
        String texto1, texto2;
        scanner.nextLine(); //hago esto para limpiar la ram, ya que el ultimo dato es double y me hace un bug
        System.out.println("Ingrese el primer texto:");
        texto1 = scanner.nextLine();
        System.out.println("Ingrese el segundo texto:");
        texto2 = scanner.nextLine();
        if (cadenasDeTextoDistintas(texto1,texto2)){
            System.out.println("Los textos ingresados son iguales");
        }else{
            System.out.println("Los textos ingresados no son iguales");
        }
    }
}
