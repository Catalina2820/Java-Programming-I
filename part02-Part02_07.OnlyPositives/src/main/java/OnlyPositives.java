
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int v1 = Integer.valueOf(scanner.nextLine());
            if (v1 < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (v1 == 0) {
                break;
            } else {
                System.out.println(v1 * v1);
            }
        }
    }
}
