//Create a program that  will compute the total bill of the customer. The program will input item purchased, quantity, price and cash given by the customer. It will display automatically the total bill and the change of the customer If the cash is greater than the total bill. If the customer reaches 1000 pesos, he will avail 30% discount of his total bill. Use if else statement and repetition structure to display the “Do you want to try again Y/N?”.


import java.util.Scanner;

public class L5_ACTIVITY_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.println("Enter price per item: ");
            double price = scanner.nextDouble();

            double total = quantity * price;

            if (total >= 1000) {
                total *= 0.7; 
                System.out.println("Congratulations! You've availed a 30% discount.");
            }

            System.out.println("Total Bill: " + total);

            System.out.println("Enter cash given by the customer: ");
            double cash = scanner.nextDouble();

            double change = cash - total;
            if (change < 0) {
                System.out.println("Insufficient cash provided.");
            } else {
                System.out.println("Change: " + change);
            }

            scanner.nextLine(); 

            System.out.println("Do you want to try again? (Y/N)");
            choice = scanner.nextLine().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        scanner.close();
        System.out.println("Thank you for using our service!");
    }
}
