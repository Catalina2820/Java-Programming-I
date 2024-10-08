
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            } else {
                list.add(num);
            }
        }
        // Then it computes the average of the numbers on the list
        int sum = 0;
        for (int val : list) {
           sum += val;
        }
        // and prints it.
        
        System.out.println("Average: " + ( sum * 1.0 / list.size()));

    }
}
