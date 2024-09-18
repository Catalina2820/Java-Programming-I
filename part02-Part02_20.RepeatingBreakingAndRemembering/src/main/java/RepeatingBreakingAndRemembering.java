
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int v1, sum = 0, num = 0, odd = 0;
        //double ave;
        System.out.println("Give numbers:");
        while (true) {
            v1 = Integer.valueOf(scanner.nextLine());
            if (v1 == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (v1 % 2 != 0) {
                odd ++;
            }
            sum += v1;
            num ++;
        }
        System.out.println("Sum " + sum);
        System.out.println("Numbers: " + num);
        System.out.println("Average: " + ( sum * 1.0 / num));
        System.out.println("Even :" + (num - odd));
        System.out.println("Odd: "+ odd);
    }
}
