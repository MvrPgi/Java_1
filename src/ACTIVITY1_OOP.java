import java.util.Scanner;

public class ACTIVITY1_OOP {
 
  public static void main(String[] args) {
     
    
     try (Scanner scanner = new Scanner(System.in)) {
          
          System.out.println("How Many Facts You Have:");
          int numFacts = scanner.nextInt();
          scanner.nextLine();
      
          String[] facts = new String[numFacts];
          System.out.println("Enter Your Informations:");
          for (int i = 0; i < numFacts; i++) {
              System.out.print("Fact " + (i + 1) + ": ");
              facts[i] = scanner.nextLine();
          }  
          System.out.println("Facts About You:");
        
          for (int i = 0; i < numFacts; i++) {
              System.out.println((i + 1) + ". " + facts[i]);
          }
        scanner.close();
      }
   }
}
   
   

