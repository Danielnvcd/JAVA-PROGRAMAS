import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Calcular el doble de un número entero");
            System.out.println("2. Calcular la mitad de un número entero");
            System.out.println("3. Calcular el cuadrado de un número entero");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ungrese un numero entero:");
                    int numero = sc.nextInt();
                    int resultadoD = numero * 2;
                    System.out.println("el doble de " + numero + " es " + resultadoD);
                    break;
                case 2:
                    System.out.println("ingrese un numero entero:");
                    numero = sc.nextInt();
                    double resultadoM = (double)numero / 2;
                    System.out.println("La mitad de " + numero + " es " + resultadoM);
                    break;
                case 3:
                    System.out.println("ingrese un numero entero:");
                    numero = sc.nextInt();
                    int resultadoC = numero * numero;
                    System.out.println("el cuadrado de " + numero + " es " + resultadoC);
                    break;
                case 4:
                    System.out.println("termino el programa ");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }

        sc.close();

    }

}









import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo, unidades;
        double precio, total;
        String producto;

        System.out.println("elija el producto:\n");
        System.out.println("codigo        producto   PRECIO");
        System.out.println("  1           camisa     $20.00");
        System.out.println("  2           cinturon   $15.00");
        System.out.println("  3           zapatos    $60.00");
        System.out.println("  4           pantalon   $30.00");
        System.out.println("  5           frazadas   $90.00");
        System.out.println("  6           faldas     $25.00");
        System.out.println("  7           gorras     $12.00");
        System.out.println("  8           SUETER     $35.00");
        System.out.println("  9           corbata    $22.00\n");

        System.out.print("Ingrese el código del producto deseado: ");
        codigo = input.nextInt();

        switch (codigo) {
            case 1:
                producto = "camisa";
                precio = 20.00;
                break;
            case 2:
                producto = "cinturon";
                precio = 15.00;
                break;
            case 3:
                producto = "zapatos";
                precio = 60.00;
                break;
            case 4:
                producto = "pantalo";
                precio = 30.00;
                break;
            case 5:
                producto = "frazadas";
                precio = 90.00;
                break;
            case 6:
                producto = "faldas";
                precio = 25.00;
                break;
            case 7:
                producto = "gorras";
                precio = 12.00;
                break;
            case 8:
                producto = "sueter";
                precio = 35.00;
                break;
            case 9:
                producto = "corbata";
                precio = 22.00;
                break;
            default:
                System.out.println("codigo de producto no valido.");
                return;
        }

        System.out.print("ungrese el numero de unidades que desea comprar: ");
        unidades = input.nextInt();

        total = precio * unidades;
        System.out.println("factura:");
        System.out.println("producto: " + producto);
        System.out.println("precio por unidad: $" + precio);
        System.out.println("cantidad de unidades: " + unidades);
        System.out.println("total a pagar: $" + total);
    }
}
