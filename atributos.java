class estudiante {
    // Se definen sus atributos
    String nombre;
    byte edad;

    // Se crea el constructor
    estudiante(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Se crea un arreglo del tipo class estudiante
        estudiante vector[] = new estudiante[3];

        vector[0] = new estudiante("Jonathan", (byte) 19);
        vector[1] = new estudiante("Jose", (byte) 18);
        vector[2] = new estudiante("Eduardo", (byte) 23);

    
        for (int i = 0; i < vector.length; i++) {
            System.out.println("estudiante " + (i + 1));
            System.out.println("nombre " + vector[i].nombre);
            System.out.println("edad " + vector[i].edad);
            System.out.println();
        }
    }
}
