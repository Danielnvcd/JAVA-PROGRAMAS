
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author daniel
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String entrada = "este es un carro, del otro carro,o el sigiuente  .";
        String delimiter = ", ";
        int dfe = 2;
        
        
                int palo3 = -1;
        for (int i = 0; i < dfe; i++) {
            palo3 = entrada.indexOf(delimiter, palo3  + 1);
            if (palo3  == -1) {
                break;
            }
        }
        
        String result = (palo3  != -1) ? entrada.substring(0, palo3 ) : entrada;
        System.out.println("texto antes del delimitador  " + result);
    }
}
    
