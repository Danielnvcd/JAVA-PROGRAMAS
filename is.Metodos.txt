EJERCICIO 1

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	
	public static void main(String[] args)throws IOException {
	    BufferedReader inst = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Ingrese un caracter");
	    String texto = inst.readLine(); 
	    char caracter= texto.charAt(0);
	    if (Character.isDigit(caracter)) {
                System.out.println("El carácter ingresado es un dígito.");
            } else {
                System.out.println("El carácter ingresado no es un dígito.");
            }
	    
	}
}

EJERCICIO 2
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	
	public static void main(String[] args)throws IOException {
	    BufferedReader inst = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Ingrese un caracter");
	    String texto = inst.readLine(); 
	    char caracter= texto.charAt(0);
	    if (Character.isLatter(caracter)) {
                System.out.println("El carácter ingresado es una letra.");
            } else {
                System.out.println("El carácter ingresado no es una letra.");
            }
	    
	}
}


EJERCICIO 3

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	
	public static void main(String[] args)throws IOException {
	    BufferedReader inst = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Ingrese un caracter");
	    String texto = inst.readLine(); 
	    char caracter= texto.charAt(0);
	    if (Character.isWhitespace(caracter)) {
                System.out.println("El carácter ingresado es un espacio en blanco.");
            } else {
                System.out.println("El carácter ingresado no es un espacio en blanco.");
            }
	    
	}
}


EJERCICIO 4

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args)throws IOException {
	    BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Escribe un texto");
	    String texto = BF.readLine(); 
	    StringBuilder inst = new StringBuilder(texto);
	    
	    System.out.println(inst.insert(3,'J'));
	}
}


EJERCICIO 5

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args)throws IOException {
	    BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Escribe un texto");
	    String texto = BF.readLine(); 
	    StringBuilder inst = new StringBuilder(texto);
	    
	    System.out.println(inst.insert(3,'J'));
	    System.out.println(inst.length());
	    
	}
}


EJERCICIO 6

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args)throws IOException {
	    BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Escribe un texto");
	    String texto = BF.readLine(); 
	    StringBuilder inst = new StringBuilder(texto);
	    
	    System.out.println(inst.insert(3,'J'));
	    System.out.println(inst.append(" EOF"));
	    
	}
}


EJERCICIO 7

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args)throws IOException {
	    BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Escribe un texto");
	    String texto = BF.readLine(); 
	    StringBuilder inst = new StringBuilder(texto);
	    
	    System.out.println(inst.reverse());
	    
	}
}

EJERCICIO 8

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un texto");
        String texto = BF.readLine();
        StringBuilder inst = new StringBuilder(texto);
        
        if (texto.equals(inst.toString().toUpperCase())) {
            System.out.println("El texto está en mayúsculas");
        } else {
            System.out.println("El texto no está en mayúsculas");
        }
    }
}



