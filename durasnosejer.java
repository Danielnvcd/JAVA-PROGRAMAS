public class Main {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            int digito1 = num / 100;
            int digito2 = (num / 10) % 10;
            int digito3 = num % 10;
            if (num == Math.pow(digito1, 3) + Math.pow(digito2, 3) + Math.pow(digito3, 3)) {
                System.out.println(num);
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un número a ");
        int a = scanner.nextInt();
        System.out.print("ingrese la cantidad de terminos n ");
        int n = scanner.nextInt();
        scanner.close();

        int s = 0;
        String numStr = "";
        for (int i = 1; i <= n; i++) {
            numStr += String.valueOf(a);
            s += Integer.parseInt(numStr);
        }
        System.out.println("el valor de s es " + s);
    }
}


public class Main {
    public static void main(String[] args) {
        int totalDurasnos = 1;
        for (int dia = 10; dia >= 1; dia--) {
            totalDurasnos = (totalDurasnos + 1) * 2;
        }
        System.out.println("el numero de Durasnos recogidos el primer dia es " + totalDurasnos);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero entero positivo con no mas de 5 dígitos ");
        int num = scanner.nextInt();
        scanner.close();

        String numStr = Integer.toString(num);
        int numDigitos = numStr.length();

        System.out.println("numero de digitos " + numDigitos);
        System.out.print("digitos en orden inverso ");
        for (int i = numDigitos - 1; i >= 0; i--) {
            System.out.print(numStr.charAt(i));
        }
    }
}


