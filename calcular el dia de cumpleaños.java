public class Main {
   public static void main(String[] args) {
      int age = 12;
      double gift = 10;
      double totalGift = 0;
      while (gift <= 1000) {
         totalGift += gift;
         age++;
         gift *= 2;
      }
      System.out.println("La niña tendrá " + age + " años cuando se le dé la última cantidad");
      System.out.println("La cantidad total recibida es de $" + totalGift);
   }
}
