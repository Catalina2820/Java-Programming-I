
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you? ");
        int v1 = Integer.valueOf(scan.nextLine());
        if (0 <= v1 && v1 <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible");
        }

    }
}
