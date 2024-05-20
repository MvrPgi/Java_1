import java.util.Scanner;

public class JAVA_L9 {
  public static void main(String[] args) {
    // while loop = executes as long as the conditon is true
    Scanner scanner = new Scanner(System.in);
    String name ="";
    int age = 0;

    do{
          System.out.print("Ano Pangalan mo ");
          name = scanner.nextLine();
          System.out.print("Ano Edad mo ");
          age = scanner.nextInt();
    }while(name.isBlank() && age == 0);
    if (age>=18){
    System.out.println("Tanda Mo Na "+name);
    }else{
    System.err.println("Bata Ka Pa Pala "+name);
    }


    
  scanner.close(); 
  }
}
