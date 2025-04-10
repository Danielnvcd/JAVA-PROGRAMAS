import java.util.Scanner;

public class Cuadrante {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa la coordenada x: ");
    double x = sc.nextDouble();

    System.out.print("Ingresa la coordenada y: ");
    double y = sc.nextDouble();

    if (x > 0 && y > 0) {
      System.out.println("El punto se encuentra en el primer cuadrante");
    } else if (x < 0 && y > 0) {
      System.out.println("El punto se encuentra en el segundo cuadrante");
    } else if (x < 0 && y < 0) {
      System.out.println("El punto se encuentra en el tercer cuadrante");
    } else if (x > 0 && y < 0) {
      System.out.println("El punto se encuentra en el cuarto cuadrante");
    } else {
      System.out.println("El punto se encuentra en un eje o en el origen");
    }
  }
}

import java.util.Scanner;

public class Venta {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double total = 0;
    int puntos = 0;

    boolean seguirComprando = true;
    while (seguirComprando) {
      System.out.print("Ingresa la descripción del artículo: ");
      String descripcion = sc.next();

      System.out.print("Ingresa el precio del artículo: ");
      double precio = sc.nextDouble();

      total += precio;
      puntos += (int) (precio / 10);

      System.out.print("¿Deseas seguir comprando? (s/n): ");
      String respuesta = sc.next();

      if (respuesta.equals("n")) {
        seguirComprando = false;
      }
    }

    System.out.println("Total de la venta: $" + total);
    System.out.println("Puntos acumulados: " + puntos);
  }
}

