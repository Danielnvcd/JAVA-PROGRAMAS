import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner lectura= new Scanner(System.in);
	
	char caracter;	
		
	System.out.println("ingresar un caracter");	
	caracter = lectura.next().charAt(0);
	
	System.out.println("El caracter ingresa es "+caracter);
	}
}
