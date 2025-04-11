import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("***********************************************");
            System.out.println("                      MENU DE OPCIONES ?");
            System.out.println("***********************************************");
            System.out.println("*");
            System.out.println("* 1. OPCION 1");
            System.out.println("* 2. OPCION 2");
            System.out.println("* 3. OPCION 3");
            System.out.println("* 4. SALIR");
            System.out.println("*");
            System.out.println("***********************************************");
            
            System.out.print("SELECCIONE UNA OPCION: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la OPCION 1");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la OPCION 2");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la OPCION 3");
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción invalida por favor seleccione una opción valida.");
                    break;
            }
            
            System.out.println();
        }
        
        System.out.println("programa finalizado");
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAhorroAnual = 0;
        
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Ingrese el monto depositado en el mes " + mes + ": ");
            double depositoMensual = scanner.nextDouble();
            
            totalAhorroAnual += depositoMensual;
            
            System.out.println("El ahorro acumulado hasta el mes " + mes + " es de $" + totalAhorroAnual);
        }
        
        System.out.println("El total de deposito anual es de $" + totalAhorroAnual);
    }
}


public class Main {
    public static void main(String[] args) {
        int[] horasTrabajadas = {8, 9, 8, 9, 9, 8};
        double[] sueldosHora = {24.60, 20.68, 23.38, 22.98, 24.06, 22.96};
        double totalSueldo = 0;

        for (int i = 0; i < horasTrabajadas.length; i++) {
            int horas = horasTrabajadas[i];
            double sueldoHora = sueldosHora[i];
            double sueldo = horas * sueldoHora;
            totalSueldo += sueldo;

            System.out.println("Día " + (i + 1) + ": " + horas + " horas trabajadas. Sueldo: $" + sueldo);
        }

        System.out.println("El total de sueldo por el trabajo en la semana es de: $" + totalSueldo);
    }
}


public class Main {
    public static void main(String[] args) {
        int meses = 20;
        int pagoActual = 10;
        int totalPagado = 0;

        for (int i = 1; i <= meses; i++) {
            totalPagado += pagoActual;
            pagoActual *= 2;
        }

        System.out.println("El total que pagaste en " + meses + " meses es de: $" + totalPagado);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] sueldosEmpleados = {70, 70, 70, 70, 70};
        int totalPago = 0;

        for (int i = 0; i < sueldosEmpleados.length; i++) {
            int sueldo = sueldosEmpleados[i];
            totalPago += sueldo;

            System.out.println("El EMPLEADO " + (i + 1) + " gana semanal: $" + sueldo);
        }

        System.out.println("La empresa pago un total de: $" + totalPago + " por los " + sueldosEmpleados.length + " empleados");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea mostrar: ");
        int cantidadPrimos = scanner.nextInt();
        int numeroActual = 2;
        int primosEncontrados = 0;

        while (primosEncontrados < cantidadPrimos) {
            if (esPrimo(numeroActual)) {
                System.out.println(numeroActual);
                primosEncontrados++;
            }
            numeroActual++;
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
