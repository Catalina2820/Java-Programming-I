
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        int num;
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            } else {
                lista.add(num);
            }
        }

        // after that, the program prints the smallest number
        int min = lista.get(0);
        for (int elemento : lista) {
            if (elemento < min) {
                min = elemento;
            }
        }
        System.out.print("Smallest number: " + min);

        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == min) {
                System.out.print("Found at index: " + i);
            }
        }

        
    }
}
