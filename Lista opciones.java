package javaapplication1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {

     public static void main(String[] args) {
   List<String> lista = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);
    int opcion;
    do{
     System.out.println("Operaciones en una lista");
     System.out.println("1 Agregar elementos a la lista");
     System.out.println("2 Actualizar elementos en la lista");
     System.out.println("3 Buscar elementos en la lista");
     System.out.println("4 Eliminar elementos de la lista");
     System.out.println("5 Acceder a elementos en la lista");
     System.out.println("6 Verificar si un elemento esta presente");
     System.out.println("7 Mostrar la lista");
     System.out.println("8 Salir");
     System.out.print("Ingrese el numero de la operacion deseada ");
     opcion = scanner.nextInt();
     
     switch (opcion){
     case 1 -> agregarelementos(lista);
     case 2 -> actualizarelementos(lista);
     case 3 -> buscarelementos(lista);
     case 4 -> eliminarelementos(lista);
     case 5 -> accederelementos(lista);
     case 6 -> verificarelemento(lista);
     case 7 -> mostrarlista(lista);
     case 8 -> System.out.println("saliendo");
     default -> System.out.println("opcion no valida");
     }}
     while (opcion != 8);
     }

    private static void agregarelementos(List<String> lista){
     Scanner scanner = new Scanner(System.in);
     System.out.print("ingrese el elemento a agregar ");
     String elemento = scanner.nextLine();
     lista.add(elemento);
     System.out.println("elemento agregado a la lista");
     }
    
    private static void actualizarelementos(List<String> lista){
      Scanner scanner = new Scanner(System.in);
      System.out.print("ingrese el indice del elemento a actualizar ");
      int indice = scanner.nextInt();
      scanner.nextLine();
      System.out.print("ingrese el nuevo valor ");
      String nuevovalor = scanner.nextLine();
      lista.set(indice, nuevovalor);
      System.out.println("elemento actualizado en la lista");
      }

     private static void buscarelementos(List<String> lista){
     Scanner scanner = new Scanner(System.in);
     System.out.print("ingrese el elemento a buscar");
     String elemento = scanner.nextLine();
     int indice = lista.indexOf(elemento);  
     System.out.println("elemento encontrado " + indice );
     }

    private static void eliminarelementos(List<String> lista){
     Scanner scanner = new Scanner(System.in);
     System.out.print("ingrese el indice del elemento a eliminar ");
     int indice = scanner.nextInt();
     String elementoeliminado = lista.remove(indice);
     System.out.println("elemento " + elementoeliminado);
     }       

    private static void accederelementos(List<String> lista){
     Scanner scanner = new Scanner(System.in);
     System.out.print("ingrese el indice del elemento  ");
     int indice = scanner.nextInt();
     String elemento = lista.get(indice);
     System.out.println("elemento en el indice " + indice + ": " + elemento);
     }

    private static void verificarelemento(List<String> lista){
     Scanner scanner = new Scanner(System.in);
     System.out.print("ingrese el elemento para verificar ");
     String elemento = scanner.nextLine();
     lista.contains(elemento);
     System.out.println("el elemento esta en la lista");
     }
    
    private static void mostrarlista(List<String> lista){
     System.out.println("La lista es " + lista);
}
}
