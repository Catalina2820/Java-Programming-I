
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int v1 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int i = 0;
        while (i < v1) {            
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
