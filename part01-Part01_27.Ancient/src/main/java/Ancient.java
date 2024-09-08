
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year");
        int v1 = Integer.valueOf(scan.nextLine());
        if (v1 < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
