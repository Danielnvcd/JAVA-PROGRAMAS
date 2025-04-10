import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        int contadorNoDigitos = 0;
        int contadorBlancos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!Character.isDigit(caracter)) {
                contadorNoDigitos++;
            }
            if (Character.isWhitespace(caracter)) {
                contadorBlancos++;
            }
        }

        System.out.println("La cantidad de no dígitos que aparecen en la cadena es: " + contadorNoDigitos);
        System.out.println("La cantidad de blancos es: " + contadorBlancos);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("MENU DE OPCIONES");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3- MULTIPLICAR");
        System.out.println("4- DIVIDIR");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                int suma = numero1 + numero2;
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                int resta = numero1 - numero2;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                int multiplicacion = numero1 * numero2;
                System.out.println("La multiplicación es: " + multiplicacion);
                break;
            case 4:
                if (numero2 != 0) {
                    double division = (double) numero1 / numero2;
                    System.out.println("La división es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción invalida.");
        }
    }
}


