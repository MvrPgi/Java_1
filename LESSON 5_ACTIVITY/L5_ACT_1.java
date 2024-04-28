// This program will describe the use of repetition structure. The user will input name and it will display on the screen 10 times.
import java.io.*;

public class L5_ACT_1 {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int alpha = 0; // Initialize alpha variable

        do {
            System.out.print("Enter Your Name: ");
            name = input.readLine();
            alpha = name.length(); // Update alpha with the length of the name
        } while (alpha < 11);

        System.out.println("\n" + name);
    }
}



