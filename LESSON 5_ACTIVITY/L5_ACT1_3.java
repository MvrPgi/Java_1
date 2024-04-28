import java.io.*;

public class L5_ACT1_3  {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        int alpha = 0; // Initialize alpha variable

        for (; ; ) {
            System.out.print("Enter Your Name: ");
            name = input.readLine();
            alpha = name.length(); // Calculate the length of the name

            if (alpha >= 11) {
                break; // Exit the loop if the condition is met
            }
        }

        System.out.println("\n" + name);
    }
}
