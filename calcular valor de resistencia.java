import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Calcular el valor de las recistencias \n dependiendo si es en serio o en paralelo");
       
  Scanner sc=new Scanner (System.in);
 
  //SE DECLARAN VARIABLES
  double R1,R2,R3,N,NT;
 
     System.out.println("ingresa el valor de la resistencia 1");
        R1=sc.nextDouble();
       
System.out.println("ingresa el valor de la resistencia 2");
R2=sc.nextDouble();

System.out.println("ingresar el valor de la resistencia ");
R3=sc.nextDouble();

    N=1/(1/R1+1/R2+1/R3);
    NT=(R1+R2+R3);
    
        System.out.println("EL VALOR EN PARALELO ES " +N+" ohms");
        
       
        System.out.println("EL VALOR EN SERIE ES " +NT+" ohms");
    }
}
