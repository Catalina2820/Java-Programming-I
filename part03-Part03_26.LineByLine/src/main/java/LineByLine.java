
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();

            if (phrase.isEmpty()) {
                break;
            }
            
            String[] words = phrase.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}
