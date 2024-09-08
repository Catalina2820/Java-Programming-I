
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int v1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int v2 = Integer.valueOf(scanner.nextLine());
        System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
        System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
        System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
        System.out.println(v1 + " / " + v2 + " = " + (1.0 * v1 / v2));
    }
}
