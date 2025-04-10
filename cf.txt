package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("ingrese un texto con su respectivo delimitador ");
        String entrada = scanner.nextLine();
        
        if (entrada.isEmpty()) {
            System.out.println("el texto esta vacío por favor ingrese un texto ");
            entrada = scanner.nextLine();
        }
        
        System.out.println("ingrese el caracter del delimitador ");
        String delimiter = scanner.nextLine();
        
        System.out.println("ingrese el numero de delimitadores que desea encontrar ");
        int numDelimiters = scanner.nextInt();
        
        int cuenta = 0;
        int despues = -1;
        int palo3 = -1;
        
        while ((palo3 = entrada.indexOf(delimiter, despues + 1)) != -1 && cuenta < numDelimiters) {
            cuenta++;
            despues = palo3;
        }
        
        String resultado = (despues != -1) ? entrada.substring(0, despues) : entrada;
        
        System.out.println("el texto antes del delimitador es " + resultado);
    }
}
