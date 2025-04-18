import java.util.Stack;

public class VerificadorBalanceo {

    public static boolean estaBalanceado(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (esApertura(caracter)) {
                pila.push(caracter);
            } else if (esCierre(caracter)) {
                if (pila.isEmpty() || !esPar(pila.pop(), caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean esApertura(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean esCierre(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private static boolean esPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}');
    }

    public static void main(String[] args) {
        String expresion = "(5+6)*(7+8)/(4+3)";
        
        if (estaBalanceado(expresion)) {
            System.out.println("La expresión está balanceada.");
        } else {
            System.out.println("La expresión no está balanceada.");
        }
    }
}
