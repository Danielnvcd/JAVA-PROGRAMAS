package javaapplication12;
import java.util.Scanner;

public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.println("Confirme su contraseña: ");
        String confirmacionContraseña = scanner.nextLine();
        
if (contraseña.equals(confirmacionContraseña)) {
            System.out.println("Contraseña confirmada");
        } else {
            System.out.println("Las contraseñas no coinciden Intentelo de nuevo.");
            return;
        }

System.out.println("Ingrese un indicio ");
        String indicioContraseña = scanner.nextLine();

        if (indicioContraseña.equals(contraseña)) {
            System.out.println("El indicio no puede ser igual ala contraseña Intentelo de nuevo");
            return;
            
        }
        System.out.println("Contraseña confirmada, Indicio registrado");
    }
}
