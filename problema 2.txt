import java.util.Scanner;

public class NumerosNaturales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, num, c15 = 0, c50 = 0, cRango = 0;

    System.out.print("Ingrese la cantidad de números a ingresar: ");
    n = sc.nextInt();

    int i = 0;
    do {
      System.out.print("Ingrese un número: ");
      num = sc.nextInt();

      if (num < 15) {
        c15++;
      }
      if (num > 50) {
        c50++;
      }
      if (num > 25 && num < 45) {
        cRango++;
      }
      i++;
    } while (i < n);

    System.out.println("Cantidad de números menores a 15: " + c15);
    System.out.println("Cantidad de números mayores a 50: " + c50);
    System.out.println("Cantidad de números en el rango entre 25 y 45: " + cRango);
  }
}
