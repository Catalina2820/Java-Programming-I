
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int v1 = Integer.valueOf(scan.nextLine());
        if (v1 < 5000) {
            System.out.println("No tax!");
        } else if (5000 <= v1 && v1 <= 25000) {
            System.out.println("Tax: " + (100 + (v1 - 5000) * 0.08));
        } else if (25000 < v1 && v1 <= 55000) {
            System.out.println("Tax: " + (1700 + (v1 - 25000) * 0.10));
        } else if (55000 < v1 && v1 <= 200000) {
            System.out.println("Tax: " + (4700 + (v1 - 55000) * 0.12));
        } else if (200000 < v1 && v1 <= 1000000) {
            System.out.println("Tax: " + (22100 + (v1 - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (v1 - 1000000) * 0.17));
        }
    }
}
