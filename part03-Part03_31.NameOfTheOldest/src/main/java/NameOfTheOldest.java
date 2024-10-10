
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String oldest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            int val = Integer.valueOf(parts[1]);

            if (max < val) {
                max = val;
                oldest = parts[0];
            }

        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
