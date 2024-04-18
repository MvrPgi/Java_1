//Create a program that converts the input dollar ($)
// into its equivalent peso Presume that one dollar is equivalent to 50.50 pesos. Then display the result on the screen.	 
import java.util.Scanner;


public class ACTIVITY_2 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Ilan Dolyar Mo: ");
  double Dollar = scanner.nextDouble();
  double DtP = Dollar*50.50; 




  System.out.println("Ito Pera Mo P: "+DtP);
  scanner.close();
  }
}
