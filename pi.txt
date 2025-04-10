import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592; // Declaración de una constante
        double area, radio;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca radio: ");

        try {
            radio = teclado.nextDouble();
            area = PI * radio * radio;
            System.out.println("El área de la circunferencia es: " + area);
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
    }
}

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double area, perimetro, radio;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca radio: ");

        try {
            radio = teclado.nextDouble();
            area = PI * pow(radio, 2);
            perimetro = 2 * PI * radio;

            System.out.printf("El área de la circunferencia es: %.2f\n", area);
            System.out.printf("Su perímetro es: %.2f", perimetro);
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
    }
}


import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double area, radio;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca radio: ");

        try {
            radio = teclado.nextDouble();
            area = PI * pow(radio, 2);

            System.out.printf("El área de la circunferencia es: %.2f", area);
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592; // Declaración de una constante
        double area, radio;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca radio: ");

        try {
            radio = teclado.nextDouble();
            area = PI * radio * radio;

            // Mostrar el resultado con dos cifras decimales
            System.out.printf("El área de la circunferencia es: %.2f", area);
        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
    }
}


