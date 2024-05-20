//Create a program that will input grade and will display the corresponding equivalent. Use if statement in a program.

//Create a program that will input grade and will display the corresponding equivalent. Use switch statement in a program.  
import java.util.Scanner;

public class L4_ACT_999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Grade: ");
        String grade = scanner.nextLine();

        if (grade.equals("E")) {
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Very Good");
        } else if (grade.equals("G")) {
            System.out.println("Good");
        } else if (grade.equals("F")) {
            System.out.println("Fair");
        } else if (grade.equals("P")) {
            System.out.println("Poor");
        } else if (grade.equals("F")) {
            System.out.println("Need Improvement");
        } else {
            System.out.println("Invalid Grade");
        }

        scanner.close();
    }
}
      

