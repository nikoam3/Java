import java.util.Scanner;

public class funciones {
    public static boolean esDivisible(int n, int divisor){
        if (n % divisor == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        /*Ejercicio 1
        Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
        función debe comprobar si el primer número es divisible por el segundo.
        boolean esDivisible(int n, int divisor)
        NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
        decimales.*/

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero:");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = scanner.nextInt();

        boolean resultado = esDivisible(num1, num2);
        System.out.println(resultado);
    }
}
