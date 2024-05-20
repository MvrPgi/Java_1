import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape to calculate its area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCircleArea();
                    break;
                case 2:
                    calculateRectangleArea();
                    break;
                case 3:
                    calculateSquareArea();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void calculateCircleArea() {
        double radius = 5.0; 
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }

    private static void calculateRectangleArea() {
        double length = 10.0; 
        double width = 8.0; 
        double rectangleArea = length * width;
        System.out.println("Area of Rectangle: " + rectangleArea);
    }

    private static void calculateSquareArea() {
        double side = 4.0; 
        double squareArea = side * side;
        System.out.println("Area of Square: " + squareArea);
    }
}
