package javaapplication16;
       
import java.util.Scanner;

public class JavaApplication16 {

    public static String[][] nombresgolosinas = {
        {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
        {"Kinder Bueno", "Bolsa variada Haribo", "Chetos", "Twix"},
        {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
        {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };

    public static double[][] precios = {
        {1.1, 0.8, 1.5, 0.9},
        {1.8, 1, 1.2, 1},
        {1.8, 1.3, 1.2, 0.8},
        {1.5, 1.1, 1.1, 1.1}
    };

    public static int[][] cantidadgolosinas = {
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5}
    };

    public static double ventasTotales = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1 Pedir golosina ");
            System.out.println("2 Mostrar golosinas ");
            System.out.println("3 Rellenar golosinas ");
            System.out.println("4 Apagar maquina ");
            System.out.print("Seleccione una opcion ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> pedirgolosina(scanner);
                case 2 -> mostrargolosinas();
                case 3 -> rellenargolosinas(scanner);
                case 4 -> {
                    apagarmaquina();
                    return;
                }
                default -> System.out.println("intentelo de nuevo");
            }
        }
    }

    public static void pedirgolosina(Scanner scanner) {
        System.out.print("ingresar la fila de la golosina  ");
        int fila = scanner.nextInt();
        System.out.print("ingresar la columna de la golosina  ");
        int columna = scanner.nextInt();

        if (fila >= 0 && fila < nombresgolosinas.length && columna >= 0 && columna < nombresgolosinas[0].length) {
            if (cantidadgolosinas[fila][columna] > 0) {
                System.out.println("tu pedido  " + nombresgolosinas[fila][columna]);
                System.out.println("precio  " + precios[fila][columna]);
                cantidadgolosinas[fila][columna]--;
                ventasTotales += precios[fila][columna];
            } else {
                System.out.println("no quedan mas unidades ");
            }
        } else {
            System.out.println("posicion no encontrada");
        }
    }

    public static void mostrargolosinas() {
        for (int fila = 0; fila < nombresgolosinas.length; fila++) {
            for (int columna = 0; columna < nombresgolosinas[0].length; columna++) {
                System.out.println("COdigo  " + fila + columna);
                System.out.println("Nombre  " + nombresgolosinas[fila][columna]);
                System.out.println("Precio  " + precios[fila][columna]);
                System.out.println("Cantidad disponible  " + cantidadgolosinas[fila][columna]);
            }
        }
    }

    public static void rellenargolosinas(Scanner scanner) {
        System.out.print("ingresar la contraseña  ");
        String contraseña = scanner.nextLine();

        if (contraseña.equals("MaquinaExpendedora2017")) {
            System.out.print("ingresar la fila de la golosina a rellenar  ");
            int fila = scanner.nextInt();
            System.out.print("ingresar la columna de la golosina a rellenar  ");
            int columna = scanner.nextInt();

            if (fila >= 0 && fila < nombresgolosinas.length && columna >= 0 && columna < nombresgolosinas[0].length) {
                System.out.print("ingresar la cantidad a rellenar ");
                int cantidad = scanner.nextInt();
                cantidadgolosinas[fila][columna] += cantidad;
                System.out.println("rellenada exitosamente ");
            } else {
                System.out.println("posicion no encontrada ");
            }
        } else {
            System.out.println("contraseña incorrecta ");
        }
    }

    public static void apagarmaquina() {
        System.out.println("MAQUINA APAGADA");
        System.out.println("ventas totales  " + ventasTotales);
    }
}
