
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        while (true) {
            int v1 = Integer.valueOf(scanner.nextLine());

            if (v1 == 0 && num < 1) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (v1 == 0) {
                System.out.println(sum * 1.0 / num);
                break;
            } else if (v1 > 0) {
                num++;
                sum += v1;
            }
        }
    }
}
