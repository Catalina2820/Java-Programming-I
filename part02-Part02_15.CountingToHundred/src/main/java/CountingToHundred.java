
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v1 = Integer.valueOf(scanner.nextLine());
        for (int i = v1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
