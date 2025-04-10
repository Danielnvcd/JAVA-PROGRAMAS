package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
     System.out.println("ingrese la cantidad de productos");
     int  n = scanner.nextInt();
      int cantidades[] = new int [n] ;
    
for (int i = 0 ; 1 < n; i++){
    System.out.println("ingrese la cantidad ");
     cantidades [i] = scanner.nextInt() ;
    
 
}
int suma =0 ;
for (int cantidad : cantidades){
    suma+=cantidad;
}
 
 System.out.println("la suma de las cantidades "+suma);
 
    }
}


package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {
        
        String[] nombresfiguras = {"", "Monogono", "Digono", "Trigono", "Tetragono", "Pentagono", "Hexagono", "Heptagono", "Octagono", "Eneagono", "Decagono"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el nnmero de lados de la figura ");
        int numerolados = scanner.nextInt();

        String nombrefigura;
        if (numerolados >= 1 && numerolados <= 10) {
            nombrefigura = nombresfiguras[numerolados];
        } else {
            nombrefigura = "figura no reconocida";
        }
 
        System.out.println("el nombre de la figura con " + numerolados + " lados es " + nombrefigura);
    }
}


package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {

        String[] estaciones = new String[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < estaciones.length; i++) {
            System.out.print("ingrese la estación del año " + (i + 1)+" " );
            estaciones[i] = scanner.nextLine();
        }

        System.out.println("las estaciones del año ingresadas son ");
        for (String estacion : estaciones) {
            System.out.println(estacion);
        }

    }
}


package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el nnmero de estudiantes ");
        int numeroestudiantes = scanner.nextInt();

        char[] generos = new char[numeroestudiantes];

        for (int i = 0; i < numeroestudiantes; i++) {
            System.out.print("ingrese el genero del estudiante " + (i + 1) + " (H para hombre M para mujer)  ");
            generos[i] = scanner.next().charAt(0);
        }

        int hombres = 0;
        int mujeres = 0;

        for (char genero : generos) {
            if (genero == 'H' || genero == 'h') {
                hombres++;
            } else if (genero == 'M' || genero == 'm') {
                mujeres++;
            }
        }

        System.out.println("cantidad de hombres  " + hombres);
        System.out.println("cantidad de mujeres  " + mujeres);

    }
}

package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese las notas del alumno " + (i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("nota " + (j + 1) + " ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        double[] promedios = new double[3];
        for (int i = 0; i < 3; i++) {
            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2]) / 3.0;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("alumno " + (i + 1) + ":");
            System.out.println("promedio  " + promedios[i]);
            if (promedios[i] > 13.0) {
                System.out.println("APROBADO");
            } else {
                System.out.println("DESAPROBADO");
            }
            System.out.println();
        }

    }
}


package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];
        String[] apellidos = new String[5];
        int[] edades = new int[5];
        char[] sexos = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese los datos del cliente " + (i + 1) + " ");
            System.out.print("nombre ");
            nombres[i] = scanner.nextLine();
            System.out.print("apellido ");
            apellidos[i] = scanner.nextLine();
            System.out.print("edad ");
            edades[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("sexo (m/f) ");
            sexos[i] = scanner.nextLine().charAt(0);
        }

        System.out.println("\ndatos de los clientes ingresados ");
        for (int i = 0; i < 5; i++) {
            System.out.println("cliente " + (i + 1) + " ");
            System.out.println("nombre  " + nombres[i]);
            System.out.println("apellido  " + apellidos[i]);
            System.out.println("edad  " + edades[i]);
            System.out.println("sexo  " + sexos[i]);
            System.out.println();
        }

    }
}


package javaapplication16;
       
import java.util.Scanner;
public class JavaApplication16 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10]; 
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("ingrese 10 numeros entre 1 y 50 ");
            int numero = scanner.nextInt();
         
            if (numero >= 1 && numero <= 50) {
                numeros[i] = numero;
                suma += numero;
            } else {
                System.out.println("numero fuera de rango ");
                i--; 
        }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("la suma de los numeros es " + suma);
    }
}
