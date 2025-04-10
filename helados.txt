package javaapplication10;
import java.util.Scanner;


public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioHelado = 1.90;
        double precioTopping = 0;

        System.out.println("Bienvenido ");
        System.out.println("El helado sin topping cuesta 1.90");
        System.out.println("El topping de oreo cuesta 1");
        System.out.println("El topping de KitKat cuesta 1.50");
        System.out.println("El topping de brownie cuesta 0.75");
        System.out.println("El topping de lacasitos cuesta 0.95");

        System.out.print("¿Que topping te gustaria agregar? ");

        try {
            String topping = scanner.nextLine();

            switch (topping) {
                case "oreo":
                    precioTopping = 1;
                    break;
                case "kitkat":
                    precioTopping = 1.5;
                    break;
                case "brownie":
                    precioTopping = 0.75;
                    break;
                case "lacasitos":
                    precioTopping = 0.95;
                    break;
                default:
                    System.out.println("no tenemos este topping");
                    break;
            }

            double precioFinal = precioHelado + precioTopping;
            System.out.println("El precio de tu helado con " + topping + " es: " + precioFinal);
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
