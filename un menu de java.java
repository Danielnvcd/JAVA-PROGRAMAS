public class Main

{
public static void main(String[] args) {
System.out.println("--ejercicio 1--");
Scanner opcion= new Scanner(System.in);
int num;
System.out.println("eliga una de las sigientes opciones 1, 2, 3, 4");
num = opcion.nextInt();

switch(num){
   case 1:
   case 2:
   case 3:
   case 4:
   System.out.println("la opcion elegida es la correcta ");
   break;
   case 5:
       System.out.println("la opcion elegida no es la correcta ");
}

}


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	Scanner sc=new Scanner (System.in);
int s;
System.out.println("ingresa el codigo");
s=sc.nextInt();

switch(s) {
  case 200:
    System.out.println("Todo ok.");
    break;
  case 301:
    System.out.println("Movimiento permanente de la página.");
    break;
  case 302:
    System.out.println("Movimiento temporal de la página.");
    break;
  case 404:
    System.out.println("Página no encontrada.");
    break;
  case 500:
    System.out.println("Error interno del servidor.");
    break;
  case 503:
    System.out.println("Servicio no disponible.");
    break;    
  default:
    System.out.println("Código de error no disponible.");
  }
   
} 
}
