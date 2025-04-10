package javaapplication16;       
import java.util.Scanner;
import java.util.Stack;
public class JavaApplication16 {
    
        public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---------Stack Menu--------");
            System.out.println("1. agregregar un elemento");
            System.out.println("2. eliminar elemento");
            System.out.println("3. ver pila");
            System.out.println("4. buscar elemento y devolver su posicion");
            System.out.println("5. consultar elemento en la parte superior");
            System.out.println("6. vaciar pila");
            System.out.println("7. terminar Programa");
            System.out.print("ingresar tu opcion ");           
            opcion = scanner.nextInt();            
            switch (opcion) {
                    case 1 -> {
                        System.out.print("ingrese el elemento a agregar ");
                        int elemento = scanner.nextInt();
                        pila.push(elemento);
                }
                    case 2 -> {
                   System.out.println("elemento eliminado " + pila.pop());                       
                }
                    case 3 -> System.out.println("contenido de la pila " + pila);
                    case 4 -> {
                        System.out.print("Ingrese el elemento a buscar  ");
                        int e= scanner.nextInt();  int posicion = pila.search(e);
                        System.out.println(" esta en la posicion " + posicion + " de la pila");
                }
                     case 5 -> System.out.println("elemento en la parte superior de la pila  " + pila.peek());
                     case 6  -> { pila.clear();    System.out.println("la pila esta vacia " + pila.empty());
            }
                     case 7 -> System.out.println("termino");
                     default -> System.out.println("opcion no valida ");
            }
                     } while (opcion != 7);    
            }        
        }        
