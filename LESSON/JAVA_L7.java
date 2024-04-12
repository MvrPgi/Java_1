import java.util.Scanner;
public class JAVA_L7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What`s Your Name: ");
    String name = scanner.next();

    System.out.println("Enter Your Weight: ");
    double fat = scanner.nextDouble();


    if (fat>=32){
      System.out.println("You Are Fat Bitch "+name);
    }
    else
    {
      System.out.println("You Are Not Fat Bitch "+name);
    }

  scanner.close(); 
  }
}
