

public class Main {
    public static void main(String[] args) {
        String string = "123-654321";
        String[] resultado = string.split("-");
        
        for (String elemento : resultado) {
            System.out.println(elemento);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        String cadena = "A,B,C,,,Z";
        String[] resultado = cadena.split(",", 10);
        
        for (String elemento : resultado) {
            System.out.println(elemento);
        }
    }
}
