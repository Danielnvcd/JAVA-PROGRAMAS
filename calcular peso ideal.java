/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("EJERCICIO 4 PESO");
   
    Scanner sc = new Scanner (System.in);
   
    //Se declaran variables
    double ALTURA, EDAD, PESO, ENCM,, PORCENTAJE;
   
    System.out.println("Ingrese su estatura en metros");
    ALTURA = sc.nextDouble();
   
    System.out.println("Ingrese su edad");
    EDAD = sc.nextDouble();
   
    ENCM = ALT*100;
    PORCENTAJE = (EDAD*10)/100;
    PESO = (ALTCM-100+EDADPORC)*0.9;
   
    //Se imprime el resultado en consola
    System.out.println("El peso recomendado para usted es de " +PESO+ " kg");
   
    }
}
