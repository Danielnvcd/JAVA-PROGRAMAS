package hexamen final;

import java.util.Scanner ;


/**
 *
 * @author daniel
 */
public class hexamen final {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        int numTurismos, numTodoterrenos;
        int capTurismos, capTodoterrenos;

        
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce el numero de turismos ");
        numTurismos = sc.nextInt();
        System.out.print("introduce el numero de todoterrenos ");
        numTodoterrenos = sc.nextInt();
        System.out.print("introduce la capacidad de los turismos litros ");
        capTurismos = sc.nextInt();
        System.out.print("untroduce la capacidad de los todoterrenos litros ");
        capTodoterrenos = sc.nextInt();

        
        int necesidadesCom = numTurismos * capTurismos + numTodoterrenos * capTodoterrenos;

        
        System.out.println("las necesidades de combustible totales son litros " + necesidadesCom);
    }
}



package hexamen final;

import java.util.Scanner ;


/**
 *
 * @author ppedo
 */
public class Hexamen final {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();
        System.out.print("ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();
        System.out.print("ingrese la coordenada x del tercer punto: ");
        double x3 = scanner.nextDouble();
        System.out.print("ingrese la coordenada y del tercer punto: ");
        double y3 = scanner.nextDouble();
        
        boolean estanAlineados = ((y2-y1)*(x3-x2) == (y3-y2)*(x2-x1));
        
        if (estanAlineados) {
            System.out.println("los tres puntos están alineados");
        } else {
            System.out.println("los tres puntos no están alineados");
        }
        
        scanner.close();
    }

}

