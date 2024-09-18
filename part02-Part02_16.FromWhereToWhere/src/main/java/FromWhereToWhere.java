
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int v1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int v2 = Integer.valueOf(scanner.nextLine());

        while (true) {
            if (v2 > v1) {
                break;
            }
            System.out.println(v2);
            v2++;
        }
    }
}
