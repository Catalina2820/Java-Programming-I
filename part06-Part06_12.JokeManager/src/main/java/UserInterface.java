
import java.util.Scanner;


public class UserInterface {
    private JokeManager manager;
    private Scanner scan;

    public UserInterface(JokeManager manager, Scanner scan) {
        this.manager = manager;
        this.scan = scan;
    } 
    
    public void start(){
        while (true) {            
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");  
            String opt = scan.nextLine();
            
            switch(opt){
                case "X":
                    return;
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scan.nextLine();
                    manager.addJoke(joke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(manager.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    manager.printJokes();
                    break;
            }
        }
        
                
    }
}
