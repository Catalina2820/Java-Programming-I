
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String opt = scan.nextLine();
            if (opt.equals("quit")) {
                break;
            }

            String[] parts = opt.split(" ");
            opt = parts[0];
            int cant = Integer.valueOf(parts[1]);

            if (opt.equals("add") && cant > 0) {
                first = first + cant;
                if (first > 100) {
                    first = 100;
                }
            }

            if (opt.equals("move") && cant > 0) {
                if (cant > first) {
                    cant = first;
                }

                first = first - cant;
                second = second + cant;

                if (second > 100) {
                    second = 100;
                }
            }

            if (opt.equals("remove") && cant > 0) {
                second = second - cant;
                if (second < 0) {
                    second = 0;
                }
            }

        }

    }
}
