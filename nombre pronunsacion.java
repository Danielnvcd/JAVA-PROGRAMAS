package javaapplication1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class JavaApplication1 {

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
List <String> Letra = new ArrayList <> ( ) ; 
Letra.add("A");
Letra.add("B");
Letra.add("C");
Letra.add("D");
Letra.add("E");
Letra.add("F");        
Letra.add("G") ;       
Letra.add ("H") ;      
Letra.add("I") ;       
Letra.add ("J");       
Letra.add("K") ;     
Letra.add ("L");     
Letra.add("M") ;       
Letra.add("N") ;       
Letra.add("Ñ") ;  
Letra.add("O");
Letra.add("P");
Letra.add("Q");
Letra.add("R");
Letra.add("S");
Letra.add("T");
Letra.add("U");
Letra.add("V");
Letra.add("W");
Letra.add("X");
Letra.add("Y");
Letra.add("Z");       
List <String> Nombre = new ArrayList <> ( ) ;
Nombre.add("a");
Nombre.add("be");
Nombre.add("ce");
Nombre.add("de");      
Nombre.add("e");
Nombre.add("efe");
Nombre.add("ge")  ;
Nombre.add("hache");
Nombre.add("i");
Nombre.add("jota");
Nombre.add("ka");
Nombre.add("ele");
Nombre.add("eme");
Nombre.add("ene");
Nombre.add("eñe");
Nombre.add("o");
Nombre.add("pe");
Nombre.add("cu");
Nombre.add("erre");
Nombre.add("ese");
Nombre.add("te");
Nombre.add("u");
Nombre.add("uve,ve,ve corta");     
Nombre.add("uve,doble,doble ve");
Nombre.add("equis"); 
Nombre.add("ye, i griega"); 
Nombre.add("zeta"); 
    
  
     System.out.print("ingrese su apellido ");
  String apellido = scanner.nextLine().toLowerCase(); 
     
   System.out.println("La pronunsiaion es ");
        for (int i = 0; i < apellido.length(); i++) {
            char Letra = apellido.charAt(i);
            String letr = String.valueOf(letra);
            
            int indice = Letra.indexOf(letr);
            if (indice != -1) {
                String sonido = Nombres.get(indice);
                System.out.print(sonido + ",");
            } else {
                System.out.print(letra + ",");

 
     }
 }
 
}
