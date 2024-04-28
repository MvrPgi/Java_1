//Create a program that will compute your midterm grade. The user will input name, course, grade for two quizzes, two recitations, two projects and grade for exam rating.  
//Compute the average of two quizzes, two recitation and two projects. Use these formulas to compute the midterm grade.	
//Class standing equals to the sum of the quiz, recitation and project divide by 3. 
//To compute prelim grade, class standing should be multiplied by 2 and add the result for exam rating.
import java.util.Scanner;


public class ACTIVIT_1 {
  public static void main(String[] args) {
  // student information
    Scanner scanner = new Scanner(System.in);
    System.out.println("What Is Your Name: ");
    String name = scanner.nextLine();
    System.out.println("Course: ");
    String course = scanner.nextLine();


    // grades
    System.out.println("Grade For Quiz 1: ");
    int Q1 = scanner.nextInt();
    System.out.println("Grade For Quiz 2: ");
    int Q2 = scanner.nextInt();
    System.out.println("Grade For Recitation 1: ");
    int R1 = scanner.nextInt();
    System.out.println("Grade For Recitation 2: ");
    int R2 = scanner.nextInt();
    System.out.println("Grade For Project 1: ");
    int P1 = scanner.nextInt();
    System.out.println("Grade For Project 2: ");
    int P2 = scanner.nextInt();

    System.out.println("Grade For Exam : ");
    int E1 = scanner.nextInt();


    //formula
    int Qavg = (Q1+Q2)/2;
    int Ravg = (R1+R2)/2;
    int Pavg = (P1+P2)/2;
    int classtand = (Qavg+Ravg+Pavg)/3;
    int prelim = (classtand * 2)+(E1)/3;

    // printing grades and student information
    System.out.println("Your Name"+name);
    System.out.println("Your Course"+course);
    System.out.println("Your ClassStand Is: "+classtand);
    System.out.println("Your Prelim Is: "+prelim);

    scanner.close();
  }
}
