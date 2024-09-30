
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        String val = scanner.nextLine();
        System.out.println("Search for? " + val);
        
        if (list.contains(val)) {
            System.out.println( val + " was found!");
        } else {
            System.out.println( val + " was not found!");
        }
    }
}
