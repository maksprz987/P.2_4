
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj pierwszą liczbę: ");
    int liczba1 = scanner.nextInt();

    System.out.print("Podaj drugą liczbę: ");
    int liczba2 = scanner.nextInt();

    int suma = liczba1 + liczba2;
    System.out.println("Suma: " + suma);

    scanner.close();
  }
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
