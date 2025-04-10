public class Main {
  public static void main(String[] args) {
    int age = 12;
    int gift = 10;
    int totalGift = 0;

    do {
      totalGift += gift;
      age++;
      gift *= 2;
    } while (gift <= 1000);

    System.out.println("Age: " + age);
    System.out.println("Total Gift: $" + totalGift);
  }
}



