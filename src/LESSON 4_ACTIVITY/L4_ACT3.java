//	Create a program that will input customer’s name, purchased item, quantity, price and cash. Compute the Total Bill and the change of the customer. If the customer reaches the total bill which is greater than or equal to 1000 pesos, he or she gets 30% discount of his/her total bill. Use if else statement.

import java.util.Scanner;
public class L4_ACT3 {
 
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter customer's name:");
          String customerName = scanner.nextLine();
          System.out.println("Enter purchased item:");
          String item = scanner.nextLine();
          System.out.println("Enter quantity:");
          int quantity = scanner.nextInt();
          System.out.println("Enter price per item:");
          double pricePerItem = scanner.nextDouble();
          System.out.println("Enter cash given by customer:");
          double cash = scanner.nextDouble();
          double totalBill = quantity * pricePerItem;
          if (totalBill >= 1000) {
              double discount = 0.3 * totalBill;
              totalBill -= discount;
          }
          double change = cash - totalBill;
          System.out.println("\nReceipt:");
          System.out.println("Customer Name: " + customerName);
          System.out.println("Item Purchased: " + item);
          System.out.println("Quantity: " + quantity);
          System.out.println("Price per Item: PHP " + pricePerItem);
          System.out.println("Total Bill: PHP " + totalBill);
          System.out.println("Cash Given: PHP " + cash);
          System.out.println("Change: PHP " + change);
  
          scanner.close();
      }
  }
  

