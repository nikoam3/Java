public class strings_integer {
    public static void main(String[] args) {
        String texto1 = "prueba";
        String texto2 = "pruebas";
        if (texto1.equals(texto2)){
            System.out.println("Ambos textos son iguales");
        }
        else{
            System.out.println("Ambos textos son distintos");
        }

        Integer valor = 8;
        Integer valor1 = 5;
        int resultado;
        resultado = valor.compareTo(valor1);
        if (valor.equals(valor1)){
            System.out.println("Ambos numeros son iguales");
        }
        else if (resultado > 0){
            System.out.println("El numero " + valor + " es mayor que " + valor1);
        }
        else{
            System.out.println("El numero " + valor1 + " es mayor que " + valor);
        }

    }
}

