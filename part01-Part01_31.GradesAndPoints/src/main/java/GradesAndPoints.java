
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int v1 = Integer.valueOf(scan.nextLine());
        if (v1 < 0) {
            System.out.println("impossible!");
        } else if (0 <= v1 && v1 <= 49 ) {
            System.out.println("failed");
        } else if (50 <= v1 && v1 <= 59 ) {
            System.out.println("1");
        } else if (60 <= v1 && v1 <= 69 ) {
            System.out.println("2");
        } else if (70 <= v1 && v1 <= 79 ) {
            System.out.println("3");
        } else if (80 <= v1 && v1 <= 89 ) {
            System.out.println("4");
        } else if (90 <= v1 && v1 <= 100 ) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}
