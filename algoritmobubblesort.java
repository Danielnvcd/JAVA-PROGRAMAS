package javaapplication16;
       
import java.util.Arrays;

public class JavaApplication16 {

    public static void main(String[] args) {
        System.out.println("Algoritmo BubbleSort");
        boolean noCambios;
        String[] datos = { "gato", "Lalo", "loro", "depresivo", "jarvis", "Montelongo" };
        String auxiliar = "";

        do {
            noCambios = false; 
            for (int i = 0; i < datos.length - 1; i++) {

                if (datos[i].compareTo(datos[i + 1]) > 0) {
                    auxiliar = datos[i];
                    datos[i] = datos[i + 1];
                    datos[i + 1] = auxiliar;
                    noCambios = true;
                    System.out.println("Arreglo: " + Arrays.toString(datos));
                }
            }
        } while (noCambios);
    }
}
