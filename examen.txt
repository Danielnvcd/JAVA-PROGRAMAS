
package javaapplication15;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char jugarnuevo;

        do {
             try {
            System.out.print("Introduce el numero inicial del rango ");
            int inicio = scanner.nextInt();

            System.out.print("Introduce el numero final del rango ");
            int fin = scanner.nextInt();

            System.out.print("Introduce el numero de intentos ");
            int intentos = scanner.nextInt();

            int aciertos = 0;
            int fallos = 0;
        
  for (int i = 0; i < intentos; i++) {
    int numero1 = random.nextInt(fin - inicio + 1) + inicio;
               System.out.println("Que numero estoy pensando?  ");
       int intento = scanner.nextInt();

                 if (intento == numero1) {
                    System.out.println("has acertado");
              aciertos++;
                     } else {
           System.out.println("no has acertado");
                     fallos++;
            }
            }
   System.out.println("has acertado " + aciertos + " has fallado " + fallos + " la solucion era");
     for (int i = 0; i < aciertos + fallos; i++) {
          System.out.print(random.nextInt(fin - inicio + 1) + inicio + " ");
            }
                       System.out.println();

                System.out.print("quieres jugar de nuevo?si=So s o No = N o n");
                jugarnuevo= scanner.next().charAt(0);
            } catch (Exception e) {
                System.out.println("error hay un numero invalido");
                scanner.nextLine(); 
                jugarnuevo= 'S';
            }
        }
        while (jugarnuevo== 'S' || jugarnuevo == 's');

        System.out.println("adios");
  }
}


