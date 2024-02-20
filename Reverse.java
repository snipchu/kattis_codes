import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int arraylen = scan.nextInt();
    int[] numarray = new int[arraylen];

    for (int i=0; i<arraylen; i++) {
      int foo = scan.nextInt();
      numarray[i] = foo;
    }

    for (int i=arraylen-1; i>0; i--) {
      System.out.println(numarray[i]);
    }
  }
}
