
import java.util.Scanner;
import java.lang.Math;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1 = Integer.valueOf(scanner.nextLine());
        int v2 = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt((v1 + v2)));
    }
}
