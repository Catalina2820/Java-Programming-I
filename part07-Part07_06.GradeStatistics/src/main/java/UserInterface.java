
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class UserInterface {

    private Scanner scan;

    public UserInterface(Scanner scan) {
        this.scan = scan;
    }

    public void start() {
        ArrayList<Integer> numbers = new ArrayList<>();
        PointAverages pa = new PointAverages(numbers);

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int num = Integer.valueOf(scan.nextLine());

            if (num == -1) {
                break;
            }
            
            numbers.add(num);

        }
        System.out.println("Point average (all): " + pa.average().get(0));
        System.out.println("Point average (passing): " + pa.average().get(1));
        System.out.println("Pass percentage: " + pa.average().get(2));
        
        System.out.println("Grade distribution:");
        pa.gradeDistribution();
    }
}
