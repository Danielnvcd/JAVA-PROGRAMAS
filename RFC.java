package javaapplication22;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication22 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         Random random = new Random();

        String nombre, paterno, materno, fecha;
        
        while (true) {            
        System.out.print("ingrese su nombre");
         nombre = scanner.nextLine();
         if (!nombre.isEmpty()) {
          break;}
        System.out.println("esta vacio");}
        
        while (true) {            
        System.out.print("ingrese su apellido paterno");
        paterno = scanner.nextLine();
        if (!nombre.isEmpty()) {
        break;}
        System.out.println("esta vacio");}
        
        while (true) {            
        System.out.print("ingrese su apellido materno");
         materno = scanner.nextLine();
         if (!nombre.isEmpty()) {
         break;}
         System.out.println("esta vacio");}
        
         while (true) {
         System.out.print("ingrese su fecha de nacimiento (dd/mm/aaaa) ");
          fecha = scanner.nextLine();
         if (fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
          String[] fechaS = fecha.split("/");
          int dia = Integer.parseInt(fechaS[0]);
          int mes = Integer.parseInt(fechaS[1]);
          int año = Integer.parseInt(fechaS[2]);
          if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && año > 1950) {
           break;
           } else {
          System.out.println("la fecha es incorrecta");
             }
          } else {
           System.out.println("fecha incorrecta debe ser (dd/mm/aaaa)");
              }}
            
        String primeraL = paterno.substring(0,1);
        String segundaL = paterno.substring(1,2);
        String primeraA = materno.substring(0,1);
        String nombreA = nombre.substring(0,1);
        
        String primera = primeraL.toUpperCase();
        String segunda = segundaL.toUpperCase();
        String tercera= primeraA.toUpperCase();
        String cuarta  = nombreA.toUpperCase();
        
        String[] fechaL = fecha.split("/");
        String dia = fechaL[0];
        String mes = fechaL[1];
        String añoA = fechaL[2];
        String año = añoA.substring(2, 4); 

        char[] homoLL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String homoL = "";
        for (int i = 0; i < 3; i++) {    
        int indiceA = random.nextInt(homoLL.length);   
        homoL += homoLL[indiceA];}
        
        System.out.println("tu rfc es :"+primera+segunda+tercera+cuarta+año+mes+dia+homoL);
   }
        }
