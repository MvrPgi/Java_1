import java.io.*;

public class While {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int count = 0; // Initialize counter

        System.out.print("Enter Your Name: ");
        name = input.readLine();

        while (count < 10) {
            System.out.println(name);
            count++; // Increment counter
        }
    }
}
