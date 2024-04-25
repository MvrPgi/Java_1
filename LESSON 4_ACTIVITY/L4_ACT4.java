//Create a program that will input a grade and will display its corresponding equivalent based on the given below. Use logical operator and else if statement in the program.
import java.util.Scanner;

public class L4_ACT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();

        double equivalent;

        if (grade >= 99 && grade <= 100) {
            equivalent = 1.00;
        } else if (grade >= 96 && grade <= 98) {
            equivalent = 1.25;
        } else if (grade >= 93 && grade <= 95) {
            equivalent = 1.50;
        } else if (grade >= 90 && grade <= 92) {
            equivalent = 1.75;
        } else if (grade >= 87 && grade <= 89) {
            equivalent = 2.00;
        } else if (grade >= 84 && grade <= 86) {
            equivalent = 2.25;
        } else if (grade >= 81 && grade <= 83) {
            equivalent = 2.50;
        } else if (grade >= 77 && grade <= 80) {
            equivalent = 2.75;
        } else if (grade >= 75 && grade <= 76) {
            equivalent = 3.00;
        } else if (grade < 75 && grade >= 0) {
            equivalent = 5.00;
        } else {
            System.out.println("Invalid grade! Grade should be between 0 and 100.");
            scanner.close(); // Close the scanner before returning
            return;
        }

        System.out.println("Equivalent: " + equivalent);

        scanner.close(); // Close the scanner after usage
    }
}
