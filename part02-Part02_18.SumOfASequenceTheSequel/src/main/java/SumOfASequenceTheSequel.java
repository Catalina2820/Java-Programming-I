
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int v1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int v2 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        for (int i = v1; i <= v2; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
