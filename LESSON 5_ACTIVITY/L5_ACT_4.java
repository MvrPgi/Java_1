import java.util.Scanner;

public class L5_ACT_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grades for prelim
        System.out.println("Enter grades for Prelim:");
        System.out.print("Quiz: ");
        double QP = scanner.nextDouble();
        System.out.print("Recitation: ");
        double RP = scanner.nextDouble();
        System.out.print("Project: ");
        double PP = scanner.nextDouble();
        System.out.print("Exam Rating: ");
        double EP = scanner.nextDouble();

        // Calculate prelim grades
        double CSP = (QP + RP) / 2;
        double projectP = PP * 0.4;
        double lectureP = ((2 * CSP + EP) / 3) * 0.6;
        double prelimGrade = projectP + lectureP;

        // Input grades for midterm
        System.out.println("\nEnter grades for Midterm:");
        System.out.print("Quiz: ");
        double QM = scanner.nextDouble();
        System.out.print("Recitation: ");
        double RM = scanner.nextDouble();
        System.out.print("Project: ");
        double PM = scanner.nextDouble();
        System.out.print("Exam Rating: ");
        double EM = scanner.nextDouble();

        // Calculate midterm grades
        double CSM = (QM + RM) / 2;
        double projectM = PM * 0.4;
        double lectureM = ((2 * CSM + EM) / 3) * 0.6;
        double classAverageM = projectM + lectureM;
        double midtermGrade = (2 * classAverageM + prelimGrade) / 3;

        // Input grades for finals
        System.out.println("\nEnter grades for Finals:");
        System.out.print("Quiz: ");
        double QF = scanner.nextDouble();
        System.out.print("Recitation: ");
        double RF = scanner.nextDouble();
        System.out.print("Project: ");
        double PF = scanner.nextDouble();
        System.out.print("Exam Rating: ");
        double EF = scanner.nextDouble();

        // Calculate finals grades
        double CSF = (QF + RF) / 2;
        double projectF = PF * 0.4;
        double lectureF = ((2 * CSF + EF) / 3) * 0.6;
        double classAverageF = projectF + lectureF;
        double finalGrade = (2 * classAverageF + midtermGrade) / 3;

        // Calculate class standing and class average
        double classStanding = (CSP + CSM + CSF) / 3;
        double classAverage = (prelimGrade + classAverageM + classAverageF) / 3;

        // Display results
        System.out.println("\nClass Standing: " + classStanding);
        System.out.println("Class Average: " + classAverage);
        System.out.println("Prelim Grade: " + prelimGrade);
        System.out.println("Midterm Grade: " + midtermGrade);
        System.out.println("Final Grade: " + finalGrade);

        // Determine grade equivalent and remark
        String gradeEquivalent = (finalGrade >= 75) ? "Passed" : "Failed";
        System.out.println("Grade Equivalent: " + gradeEquivalent);

        scanner.close();
    }
}
