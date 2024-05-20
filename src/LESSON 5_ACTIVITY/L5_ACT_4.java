import java.util.Scanner;

public class L5_ACT_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Input grades for Prelim");
            System.out.println("2. Input grades for Midterm");
            System.out.println("3. Input grades for Finals");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputGrades("Prelim", scanner);
                    break;
                case 2:
                    inputGrades("Midterm", scanner);
                    break;
                case 3:
                    inputGrades("Finals", scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void inputGrades(String exam, Scanner scanner) {
        System.out.println("\nEnter grades for " + exam + ":");
        System.out.print("Quiz: ");
        double Q = scanner.nextDouble();
        System.out.print("Recitation: ");
        double R = scanner.nextDouble();
        System.out.print("Project: ");
        double P = scanner.nextDouble();
        System.out.print("Exam Rating: ");
        double E = scanner.nextDouble();

        double CS = (Q + R) / 2;
        double project = P * 0.4;
        double lecture = ((2 * CS + E) / 3) * 0.6;
        double classAverage = project + lecture;

        System.out.println("\nClass Standing for " + exam + ": " + CS);
        System.out.println("Class Average for " + exam + ": " + classAverage);
    }
}
