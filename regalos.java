public class Main {
  public static void main(String[] args) {
    int edad = 12;
    int regalo = 10;
    int total = 10;
    
    do {
      regalo *= 2;
      total += regalo;
      edad++;
    } while (regalo <= 1000);
    
    System.out.println("La edad cuando se recibirá la última cantidad es: " + edad);
    System.out.println("La cantidad total recibida es: $" + total);
  }
}



