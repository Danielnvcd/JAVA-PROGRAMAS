import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner lectura= new Scanner(System.in);
	
	char letra;	
	
	System.out.println("escribe una letra en minuscula");	
	letra = lectura.next().charAt(0);
	
	if ( (letra>='a') && (letra<='z') )
	
	System.out.println("El caracter ingreso es una letra ");
	else
	System.out.println("El caracter ingreso no es una letra ");
