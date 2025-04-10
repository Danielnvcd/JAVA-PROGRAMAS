import java.util.Scanner;

public class ConversionNumerica {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        int decimal;
        String resultado = "";
        
        System.out.println("ELIGE UNA OPCION PARA REALIZAR LA CONVERSION:");
        System.out.println("1.- DECIMAL     —> BINARIO");
        System.out.println("2.- DECIMAL     —> OCTAL");
        System.out.println("3.- DECIMAL     —> HEXADECIMAL");
        opcion = sc.nextInt();
        
        System.out.println("Ingresa el número decimal a convertir:");
        decimal = sc.nextInt();
        
        switch(opcion) {
            case 1:
                resultado = Integer.toBinaryString(decimal);
                System.out.println(decimal + " en binario es: " + resultado);
                break;
            case 2:
                resultado = Integer.toOctalString(decimal);
                System.out.println(decimal + " en octal es: " + resultado);
                break;
            case 3:
                resultado = Integer.toHexString(decimal);
                System.out.println(decimal + " en hexadecimal es: " + resultado);
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
