// Modify the program in your assignment and convert it to the remaining types of repetition structures such as whole loop and for loop statement. It displays the same output but it is written in different ways, applying the syntax for every repetition statement.
import java.io.*;

public class L5_ACT1_2 {

  public static void main(String[] args) throws Exception {
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

      String name = "";
      int alpha; // Declare alpha variable

      System.out.print("Enter Your Name: ");
      name = input.readLine();
      alpha = name.length(); // Calculate the length of the name

      while (alpha < 11) {
          System.out.print("Enter Your Name: ");
          name = input.readLine();
          alpha = name.length(); // Update alpha with the length of the name
      }

      System.out.println("\n" + name);
  }
}
