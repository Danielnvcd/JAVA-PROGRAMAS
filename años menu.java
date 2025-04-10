package javaapplication3;
import java.util.InputMismatchException;
import java.util.Scanner ;


/**
 *
 * @author daniel_riv
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);
        int opcion;

        do {
            try {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Año natural");
                System.out.println("2. Año bisiesto");
                System.out.println("3. Año comercial");
                System.out.println("0. Salir");
                opcion = contador.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Todos sabemos que el año natural tiene 365 días. Pero además, los meses tienen\n" +
"diferentes números de días cada uno de ellos, esto es:\n" +
"Tienen 31 días: Enero, marzo, mayo, julio, agosto, octubre y diciembre.\n" +
"Tienen 30 días: Abril, junio, septiembre y noviembre.\n" +
"Tienen 28 días: Febrero.");
                        break;
                    case 2:
                        System.out.println("También tenemos los años bisiestos en los que, al año normal, se le añade en el\n" +
"mes de febrero un día más y en consecuencia febrero tendrá 29 días y el total del\n" +
"año 366 días.");
                        break;
                    case 3:
                        System.out.println("En ciertas ocasiones, para facilitar los cálculos nos será de interés tomar todos los\n" +
"meses con el supuesto de que todos tienen el mismo número de días y este número\n" +
"será de 30. Con ello el año, que denominaremos comercial, pasará a tener sólo 360\n" +
"días (12 x 30 días cada mes).");
                        break;
                    case 0:
                        System.out.println("fin del progrma");
                        break;
                    default:
                        System.out.println("opción invalida seleccione otra opcion.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("debe ingresar un valor de tipo int");
                contador.nextLine(); // descartar la entrada no valida para que no se convierta en un bucle infinito
                opcion = -1; // establecer opción en un valor invalido para repetir el bucle
            } finally {
                
                contador.nextLine();
            }
        } while (opcion != 0);
        // limpio el bufer del scaner
        contador.close();
    }
}
