
package javaapplication15;
import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          while (true) {

        System.out.println("ingresar numero en notacion cientifica");
        String numero = scanner.next();      
        
 if (numero.contains("e") || numero.contains("E")) {
     try {
       double numero1 = Double.parseDouble(numero);
      System.out.println("El numero ingresado es " + numero1);
      break;
            } catch (NumberFormatException e) {
            }
        } else {

            System.out.println("el numero ingresado no es valido");
         
        }
    }
}
}
