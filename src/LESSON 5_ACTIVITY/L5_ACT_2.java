
public class L5_ACT_2 {
  public static void main(String[] args) {
    // Display column headers
    System.out.print("   ");
    for (int i = 1; i <= 10; i++) {
        System.out.printf("%4d", i);
    }
    System.out.println("\n-----------------------------------------");

    // Display table body
    for (int i = 1; i <= 10; i++) {
        System.out.printf("%2d |", i);
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%4d", i * j);
        }
        System.out.println();
    }
}
}

