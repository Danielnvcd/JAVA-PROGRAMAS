// Se importa la librería Scanner
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("ingresar un numero y obtener uno antes y uno despues");
     
     // Se crea una instancia de la clase Scanner
      Scanner sc = new Scanner (System.in);
     
      // Se declaran variables
      double numero,numero1;
       System.out.println("Ingresa tu numero ");
        // Se lee desde teclado el numero
        numero=sc.nextDouble();
       
        // Se obtiene los numeros
        numero=(numero-1);
        numero1=(numero+2);
       
        // Se imprime el resultado en consola
        System.out.println("El numero menor es "+numero); 
        
        System.out.println("El numero mayor es "+numero1); 
    }
    }
