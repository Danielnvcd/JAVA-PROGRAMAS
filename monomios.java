import java.util.Scanner;

public class SumaRestaMonomios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coeficiente1, coeficiente2, exponente1, exponente2;
        
        // Pedimos el primer monomio
        System.out.println("Introduce el coeficiente del primer monomio:");
        coeficiente1 = sc.nextInt();
        System.out.println("Introduce el exponente del primer monomio:");
        exponente1 = sc.nextInt();
        
        // Pedimos el segundo monomio
        System.out.println("Introduce el coeficiente del segundo monomio:");
        coeficiente2 = sc.nextInt();
        System.out.println("Introduce el exponente del segundo monomio:");
        exponente2 = sc.nextInt();
        
        // Sumamos los monomios
        if (exponente1 == exponente2) {
            int coeficienteTotal = coeficiente1 + coeficiente2;
            System.out.println("La suma de los monomios es: " + coeficienteTotal + "x^" + exponente1);
        } else {
            System.out.println("No se pueden sumar los monomios porque tienen exponentes diferentes.");
        }
        
        // Restamos los monomios
        if (exponente1 == exponente2) {
            int coeficienteTotal = coeficiente1 - coeficiente2;
            System.out.println("La resta de los monomios es: " + coeficienteTotal + "x^" + exponente1);
        } else {
            System.out.println("No se pueden restar los monomios porque tienen exponentes diferentes.");
        }
        
        sc.close();
    }
}
