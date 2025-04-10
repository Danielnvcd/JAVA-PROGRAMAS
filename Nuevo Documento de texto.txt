import java.util.Scanner;

public class VerificarContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.println("Confirme su contraseña: ");
        String confirmacionContraseña = scanner.nextLine();

        if (contraseña.equals(confirmacionContraseña)) {
            System.out.println("Contraseña confirmada.");
        } else {
            System.out.println("Las contraseñas no coinciden. Inténtelo de nuevo.");
            return;
        }

        // Indicio
        System.out.println("Su contraseña debe contener al menos 8 caracteres y contener números y letras mayúsculas y minúsculas.");
    }
}
