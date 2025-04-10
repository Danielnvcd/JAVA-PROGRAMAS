public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        operaciones(num1, num2);
    }

    public static void operaciones (int num1, int num2) {
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));
    }
}
