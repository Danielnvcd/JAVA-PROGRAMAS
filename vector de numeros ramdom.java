package javaapplication16;

import java.util.Random;


public class JavaApplication16 {

    public static void main(String[] args) {
      
        int[] vectorNumeros = new int[10];
        
        
        Random random = new Random();
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = random.nextInt(10) + 1;
        }
        
        System.out.println("numero\tcuadrado\tCubo");
        for (int numero : vectorNumeros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t\t" + cuadrado + "\t\t" + cubo);
        }
    }
}




package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("La nota debe estar entre 0 y 10.");
                i--; // Repetir la entrada de la nota.
            } else {
                suma += notas[i];
            }
        }

        System.out.println("las notas ingresadas son ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        double promedio = suma / 5;
        System.out.println("la nota media es  " + promedio);
    }
}


import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10];
        int contador = 0;
                System.out.println("introduzca numeros para rellenar el vector introduzca un numero negativo para terminar ");

        while (contador < 10) {
            System.out.print("ingrese un numero: ");
            int numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            vector[contador] = numero;
            contador++;
        }

        System.out.println("Elementos del vector:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}
