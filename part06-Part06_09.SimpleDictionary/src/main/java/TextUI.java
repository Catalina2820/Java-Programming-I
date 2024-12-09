
import java.util.Scanner;

public class TextUI {

    private Scanner scan;
    private SimpleDictionary dict;

    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scan = scan;
        this.dict = dict;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String opt = scan.nextLine();

            switch (opt) {
                case "end":
                    System.out.println("Bye bye!");
                    return; //break solo termina el switch mas no el ciclo
                case "add":
                    System.out.print("Word: ");
                    String word = scan.nextLine();
                    System.out.print("Translation: ");
                    String translation = scan.nextLine();
                    dict.add(word, translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String translate = scan.nextLine();
                    String rta = dict.translate(translate);
                    
                    if (rta == null) {
                        System.out.println("Word "+ translate +" was not found");
                    } else {
                        System.out.print("Translation: " + rta);
                    }
                default:
                    System.out.println("Unknown command");
            }
        }
    }
    
   

}
