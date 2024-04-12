import java.util.Scanner;
public class JAVA_L8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What Is The Day");
    String Day = scanner.nextLine();

    switch(Day){
      case"Sunday": System.out.println("It is Sunday");
      break;
      case"Saturday": System.out.println("It is Saturday");
      break;
      case"Friday": System.out.println("It is Friday");
      break;
      case"Monday": System.out.println("It is Monday");
      break;
      default: System.err.println("It's not your time yet");

    }
    
    scanner.close();
  }
}
