import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        //SCANNER
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        float coeficiente;
        String nombre;
        String apellido;
        char inicial;
        System.out.println("Ingrese el primer valor: ");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        numero2 = scanner.nextInt();
        System.out.println("Ingrese el coeficiente: ");
        coeficiente = scanner.nextFloat();

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.next();
        System.out.println("Ingrese su apellido: ");
        apellido = scanner.next();
        inicial = nombre.charAt(0); apellido.charAt(0);
        System.out.println("Sus iniciales son: " + inicial);

    }
}
