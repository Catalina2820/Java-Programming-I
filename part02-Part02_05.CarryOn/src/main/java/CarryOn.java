
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String v1 = scanner.nextLine();
            if (v1.equals("no")) {
                break;
            }
        }
    }
}
