public class Main {
  public static void main(String[] args) {
    int edad = 12;
    int acumulador = 10;

    while (acumulador <= 1000) {
      acumulador *= 2;
      edad++;
    }

    System.out.println("La niña tendrá " + edad + " años cuando exceda los $1000");
    System.out.println("La niña tendrá un total de $" + acumulador);
  }
}



public class Main {
  public static void main(String[] args) {
    int contador = 0;

    do {
      System.out.println(contador);
      contador++;
    } while (contador <= 10);
  }
}


