import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to input grades
        System.out.print("Enter prelim grade: ");
        double prelimGrade = scanner.nextDouble();

        System.out.print("Enter midterm grade: ");
        double midtermGrade = scanner.nextDouble();

        System.out.print("Enter finals grade: ");
        double finalsGrade = scanner.nextDouble();

    
        double totalGrade = prelimGrade + midtermGrade + finalsGrade;
        double averageGrade = totalGrade / 3;

        System.out.println("Total grade: " + totalGrade);
        System.out.println("Average grade: " + averageGrade);

        scanner.close();
    }
}
