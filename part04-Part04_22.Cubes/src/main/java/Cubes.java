
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val;
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
                   
            System.out.println((int)Math.pow(Integer.valueOf(line) ,3));
        }
    }
}
