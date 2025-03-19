import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj rozmiar boku trójkąta .");
    System.out.println("pierwszy bok przyległy.");
    
    int a = scanner.nextInt();
    System.out.println("drugi bok przyległy .");
    int b = scanner.nextInt();
    System.out.println("trzeci bok .");
    int c = scanner.nextInt();
    int pole = (a*b)/2;
    System.out.println("Pole trójkąta prostokątnego wynosi: " + pole);
      
  }
  


  
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}