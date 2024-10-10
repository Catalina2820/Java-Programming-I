
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            int val = Integer.valueOf(parts[1]);

            if (max < val) {
                max = val;
            }

        }
        System.out.println("Age of the oldest: " + max);
    }
}
