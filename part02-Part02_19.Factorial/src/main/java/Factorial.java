
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int v1 = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int fact = 1;
        
        while (i < v1 ) {            
            i++;
            fact *= i;
        }
        
        System.out.println("Factorial: " + fact);
    }
}
