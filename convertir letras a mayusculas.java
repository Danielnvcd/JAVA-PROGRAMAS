import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner lectura= new Scanner(System.in);
	
	char letra;	
	String Mayuscula;
	
	System.out.println("Ingresar una letra en minuscula");	
	letra = lectura.next().charAt(0);
	
	Mayuscula =Character.toString(letra);
	
	System.out.println("El caracter ingresa en mayuscula es "+Mayuscula.toUpperCase());
	}
}
