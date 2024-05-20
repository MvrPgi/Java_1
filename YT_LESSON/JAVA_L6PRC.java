import java.util.Scanner;
public class JAVA_L6PRC {
  
  public static void main(String[] args) {

    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in);

    System.err.println("Enter Side X: ");
    x = scanner.nextDouble();

    System.err.println("Enter Side Y: ");
    y = scanner.nextDouble();
    z = Math.sqrt((x*x)+(y*y));

    System.out.println("Your Hypotenus: "+z);

    
    
  scanner.close();
  }
}
