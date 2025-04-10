public class Main {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Ford", "Focus", "Rojo", "ABC123", 15000.0);
        Coche coche2 = new Coche("Toyota", "Corolla", "Azul", "XYZ789", 18000.0);
        Coche coche3 = new Coche("Honda", "Civic", "Negro", "DEF456", 20000.0);

        System.out.println("Coches con precio original:");
        System.out.println("Coche 1 - Precio: " + coche1.precioVenta());
        System.out.println("Coche 2 - Precio: " + coche2.precioVenta());
        System.out.println("Coche 3 - Precio: " + coche3.precioVenta());

        Coche.cambiarDescuento(10);

        System.out.println("\nCoches con descuento aplicado:");
        System.out.println("Coche 1 - Precio: " + coche1.precioVenta());
        System.out.println("Coche 2 - Precio: " + coche2.precioVenta());
        System.out.println("Coche 3 - Precio: " + coche3.precioVenta());
    }
}
