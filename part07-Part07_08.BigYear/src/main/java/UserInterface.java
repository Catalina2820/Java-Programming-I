
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.birds = new ArrayList<>();
    }

    public void start() {

        System.out.println("Commands\n"
                + "Add - adds a bird\n"
                + "Observation - adds an observation\n"
                + "All - prints all birds\n"
                + "One - prints one bird\n"
                + "Quit - ends the program"
        );
        while (true) {
            System.out.print("?");
            String opt = scan.nextLine();

            switch (opt) {
                case "Quit":
                    return;
                    
                case "Add":
                    addBird();
                    break;

                case "Observation":
                    addObervation();
                    break;

                case "All":
                    printAll();
                    break;

                case "One":
                    printOne();
                    break;

                default:
                    System.out.println("Unknown command!");
            }
        }
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Name in Latin: ");
        String latin = scan.nextLine();

        birds.add(new Bird(name, latin));
    }

    public void addObervation() {
        System.out.println("Bird? ");
        String name = scan.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.addObservation();
                return;
            }
        }
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOne() {
        System.out.print("Bird? ");
        String name = scan.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println("Not a bird!");
    }
}
