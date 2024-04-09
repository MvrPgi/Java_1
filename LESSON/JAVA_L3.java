import java.util.Scanner;
public class JAVA_L3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Name Please");  //STRING
    String name =scanner.nextLine();
    System.out.println("Age Please");   // INTEGER
    int age =scanner.nextInt();
    scanner.nextLine();
    System.out.println("Food Please");   // INTEGER
    String food = scanner.nextLine();


    System.out.println("-------------------------------------------------------");
    System.out.println(""+name);
    System.out.println(""+age);
    System.out.println(""+food);


  scanner.close();
  }
}
