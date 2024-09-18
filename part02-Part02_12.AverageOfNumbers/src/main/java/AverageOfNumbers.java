
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int v1 = Integer.valueOf(scanner.nextLine());

            if (v1 == 0) {
                System.out.println("Average of the numbers: " + (sum * 1.0 / num));
                break;
            }
            num++;
            sum += v1;
        }
    }
}
