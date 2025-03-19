import java.util.Scanner;
import java.awt.image.ImageFilter;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj pierwszy bok przyległy.");
    int a = scanner.nextInt();
    System.out.println("drugi bok przyległy .");
    int b = scanner.nextInt();
    System.out.println("trzeci bok .");
    int c = scanner.nextInt();
    int pole = (a*b)/2;
    System.out.println("Pole trójkąta prostokątnego wynosi: " + pole);
      if (a <= 0 || b <= 0 || c <= 0) {
          System.out.println("Złe dane");
      } else {
    if (a*a + b*b == c*c) {
    System.out.println("Trójkąt jest prostokątny.");
    }
      else{
      System.out.println("Trójkąt nie jest prostokątny.");

      }

    }
  }
}    

  


  
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
