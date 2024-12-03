
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<File> files = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            } 
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            File file1 = new File(id,name);
            
            if (files.contains(file1)) {
                continue;
            } else {
                files.add(file1);
            }
            
        }
        
        System.out.println("==Items==");
        for (File file : files) {
            System.out.println(file.getId() + ": " + file.getName());
        }
    }
}
