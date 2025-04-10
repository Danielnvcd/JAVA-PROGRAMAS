import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner (System.in);
		int x = 0 , y = 0;
		double m = 0.0, n = 0.0 ;
		String s = "" ;
		
		try {
		    System.out.println("intruduce un numero entero ");
		    x = sc.nextInt();
		    
		    System.out.println("intruduce otro numero entero ");
		    y = sc.nextInt();
		    
		    System.out.println("intruduce un texto ");
		     s = sc.next();
		     
		     System.out.println("intruduce un numero double ");
		     m = sc.nextDouble();
		     
		     
		     System.out.println("intruduce otro numero double  ");
		     n = sc.nextDouble();
		      
		
		    } catch (Exception e) {
		         
		      System.out.println("error en la entrada de datos asegurate de introducir numeros enteros y dobles \n cuando se te pida");
		      return ;
		     }
		     
                    System.out.println("primer int introducido -> " + x);
                    System.out.println("segundo int introducido -> " + y);
                    System.out.println("primer double introducido -> " + m);
                    System.out.println("segundo double introducido -> " + n);
                    System.out.println("Texto introducido: " + s);
    }
}


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner (System.in);
		String palabra ;
		
		try {
		   do {
		       palabra = sc.next();
		       
		  //     System.out.println(palabra);
		  
		  
		   }while (!palabra.equals("fin"));
		   
		}
		catch (Exception e) {
		    
		    e.printStackTrace();
		    
		}finally{
		 sc.close();   
		}
	}
 }
 
 
