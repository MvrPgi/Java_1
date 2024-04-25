//Create a program that will input a password and will determine if the password is correct, display the message, “Password is granted” otherwise “Password is denied”. Use your name as your password. The password should be written in uppercase letters.
import java.util.Scanner;
public class L4_ACT1 {
    public static void main(String[] args) {
        
        String correctPassword = "ALWYN"; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String userInput = scanner.next(); 

      
        if (userInput.equals(correctPassword)) {
            System.out.println("Password is granted");
        } else {
            System.out.println("Password is denied");
        }

      
        scanner.close(); 
    }
}

