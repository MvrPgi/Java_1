//	Create another program that will input a number and will determine if it is odd or even number. Use if else statement in the program.
import java.util.Scanner;

  public class L4_ACT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        scanner.close();
    }
}

