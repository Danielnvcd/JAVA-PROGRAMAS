import java.util.Scanner;

public class Main {
    
    public static class edificio {
  
        // se crean ATRIBUTOS
        String nombre;
        String color;
        double precio;
        float peso;

        // se crea el CONSTRUCTOR   
        edificio (String nombre,String color,double precio,float peso) {
            this.nombre = nombre;
            this.color = color;
            this.precio = precio;
            this.peso = peso;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del edificio: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el color del edificio: ");
        String color = scanner.nextLine();
        
        System.out.print("Ingrese el precio del edificio: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese el peso del edificio (en toneladas): ");
        float peso = scanner.nextFloat();

        // se crea un OBJETO de la clase edificio
        edificio edif1 = new edificio(nombre, color, precio, peso);

        System.out.println("Nombre: " + edif1.nombre);
        System.out.println("Color: " + edif1.color);
        System.out.println("Precio: " + edif1.precio);
        System.out.println("Peso: " + edif1.peso + " Tn");
        
        scanner.close();
    }
}
