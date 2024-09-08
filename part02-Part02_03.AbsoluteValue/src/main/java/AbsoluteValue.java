
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = Integer.valueOf(scanner.nextLine());
        if (v1 > 0) {
            System.out.println(v1);
        } else {
            System.out.println(-1 * v1);
        }
    }
}
