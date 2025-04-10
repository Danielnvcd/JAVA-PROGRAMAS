import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        int n,s=0,x;
        double p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de numeros a promediar :");
        n=teclado.nextInt();
   
        for(int i=1;i<=n;i++)
        { 
         System.out.println("numero ["+i+"]=") ;
         x=teclado.nextInt();
         s=s+x;                
        }   
        p=s/n;
        
         System.out.println("El promedio es:"+p) ;                              
    }   
}



#include<iostream>
#include<conio.h>
using namespace std;
int main(){

  int a,suma = 0, suma2 = 0, suma3 = 0;

  cout<<"Digite la cantidad de elemntos que desea que tenga la suma factorial: ";
  cin>>a;

  for(int b=1; b<=a; b= b+2){
   
     suma +=b; 
    } 
  for(int b=0; b<=a; b= b+2){
   
     suma2 +=b; 
    } 

   suma3 = suma - suma2;
   cout<<"El resultado es: "<<suma3;
   
   
    getch;
	return 0;
}
