public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        int n = 1;
        double piC = 0.0;
 
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese un numero los numeros 1 10 100 1000 100000 1000000 : ");
        n = teclado.nextInt();
 
        
        while (n > 0) {
            
            double termino = Math.pow(-1, n+1) / (2 * n - 1);
            
            piC += termino;
            
            n = n - 1;
        }
 
        
        piC = piC * 4;
 
        
        System.out.println("Valor de Pi: " + piC);
 
    }
 
}
