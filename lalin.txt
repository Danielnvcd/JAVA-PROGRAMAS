import java.util.Scanner;

public class MenuProductosBinomios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            seleccionarProducto(opcion, scanner);
        } while (opcion != 4);

        System.out.println("Gracias por usar el programa. ¡Hasta luego!");
    }

    public static void mostrarMenu() {
        System.out.println("---- Menú de Productos de Binomios ----");
        System.out.println("1. Binomio al Cuadrado");
        System.out.println("2. Binomio al Cubo");
        System.out.println("3. Factorización de Binomios");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void seleccionarProducto(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado Binomio al Cuadrado.");
                System.out.print("Ingrese el valor de 'a': ");
                double a = scanner.nextDouble();
                System.out.print("Ingrese el valor de 'b': ");
                double b = scanner.nextDouble();
                double resultadoCuadrado = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
                System.out.println("El resultado del binomio al cuadrado es: " + resultadoCuadrado);
                break;
            case 2:
                System.out.println("Has seleccionado Binomio al Cubo.");
                System.out.print("Ingrese el valor de 'a': ");
                double aCubo = scanner.nextDouble();
                System.out.print("Ingrese el valor de 'b': ");
                double bCubo = scanner.nextDouble();
                double resultadoCubo = Math.pow(aCubo, 3) + 3 * Math.pow(aCubo, 2) * bCubo + 3 * aCubo * Math.pow(bCubo, 2) + Math.pow(bCubo, 3);
                System.out.println("El resultado del binomio al cubo es: " + resultadoCubo);
                break;
            case 3:
                System.out.println("Has seleccionado Factorización de Binomios.");
                System.out.println("La factorización de un binomio generalmente requiere un análisis más detallado y no se puede realizar automáticamente.");
                System.out.println("Puedes utilizar métodos como el método del trinomio cuadrado perfecto o el método de la diferencia de cuadrados para factorizar binomios específicos.");
                break;
            case 4:
                break;
            default:
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                break;
        }
        System.out.println();
    }
}
