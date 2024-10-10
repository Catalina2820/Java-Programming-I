
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        double sum = 0;
        int index = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            int val = Integer.valueOf(parts[1]);

            if (longest.length() < parts[0].length()) {
                longest = parts[0];
            }  
            sum += val;
            
            index ++;
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (sum / index ) );
    }
}
