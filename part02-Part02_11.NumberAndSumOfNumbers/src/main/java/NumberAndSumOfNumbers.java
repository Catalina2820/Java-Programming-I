
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int v1 = Integer.valueOf(scanner.nextLine());

            if (v1 == 0) {
                System.out.println("Number of numbers: " + num);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
            num++;
            sum += v1;
        }
    }
}
