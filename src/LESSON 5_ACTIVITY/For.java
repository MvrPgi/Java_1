import java.io.*;

public class For {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name;

        System.out.print("Enter Your Name: ");
        name = input.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}
