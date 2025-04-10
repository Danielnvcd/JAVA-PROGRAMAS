import java.util.Scanner;
public class Main
{
    public static String saludar(String nombre)
    {
        //Se crea el mensaje de saludo
        String saludo = "Hola. Bienvenido " + nombre;
        
        return saludo; //Se retorna el saludo
    }

    public static String error(String nombre)
    {
        //Se crea el mensaje de error
        String error = "No pudimos validar tus datos. " + nombre + " es tu usuario?";

        return error; //Se retorna el error
    }

    public static void verificar(String usuario, String contraseña)
    {
        String usuarioValido = "Santiago";

        String contraseñaValida = "MiPass";

        //Se validan los datos
        if(usuarioValido.equals(usuario) && contraseñaValida.equals(contraseña))
        {
            //Si son validos se llama a la función saludar y se muestra el mensaje retornado por pantalla
            System.out.println(saludar(usuario));
            return; //Terminamos la ejecución
        }
        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
        System.out.println(error(usuario));
    }


     public static void main(String[] args) {

    String usuarioCorrecto = "Santiago";
    String contrasenaCorrecta = "Mipass";

    int intentos = 1;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su nombre de usuario: ");
    String usuario = scanner.nextLine();

    System.out.print("Ingrese su contraseña: ");
    String contrasena = scanner.nextLine();

    while (!usuario.equals(usuarioCorrecto) || !contrasena.equals(contrasenaCorrecta)) {

      if (intentos == 3) {
        System.out.println("Ha excedido el número de intentos permitidos. El programa se cerrará.");
        return;
      }

      System.out.println("Credenciales incorrectas. Por favor intente de nuevo.");

      System.out.print("Ingrese su nombre de usuario: ");
      usuario = scanner.nextLine();

      System.out.print("Ingrese su contraseña: ");
      contrasena = scanner.nextLine();

      intentos++;

    }

    System.out.println("Bienvenido, " + usuario + "!");

 }
}
