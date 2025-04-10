
package javaapplication24;

import java.util.Scanner;

public class JavaApplication24 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String opcion;
        System.err.println("EXAMEN ORDINARIO");
        System.err.println("Convertir A Decimal A Vigecimal Y Viceversa");
        
        System.err.println("Ecoge alguna de estas 2 opciones \n1.Decimal a Vigesiimal \n2.Vigesimal a Decimal");
         opcion = scanner.nextLine();
       switch (opcion) {
       case "1":
                
           System.out.println("ingresar el numero a convertir a vigesimal");
           int decimal = scanner.nextInt();
           scanner.nextLine(); 
           String vigesimal = "";
           final char[] digitosV = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
           if (decimal == 0) {
           vigesimal = "0";
           } else {     
          while (decimal > 0) {
           int resto = decimal % 20;
           vigesimal = digitosV[resto] + vigesimal;
           decimal = decimal / 20; 
           }
            }
           System.out.println("en numero vigecimal " + vigesimal);

                break;
            case "2":
                System.out.println("ingresar el numero vigesimal a decimal");
                String simboloV= scanner.nextLine();
                int numeroDecimal = 0;
                final int base = 20;
                final char[] digitosv1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
                for (int i = 0; i < simboloV.length(); i++) {
                char c = simboloV.charAt(i);
                int valor = -1;
                for (int j = 0; j < digitosv1.length; j++) {
                if (c == digitosv1[j]) {
                valor = j;
                 break;
                 }
                  }
                 numeroDecimal = numeroDecimal * base+ valor;
                 }
                
                System.out.println("El número decimal es: " + numeroDecimal);
                break;
                default:
                System.out.println("Ingrese un numero valido");
                break;
                
                }
                 }
                 }

