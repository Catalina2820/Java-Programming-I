
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> year = new ArrayList<>();
        
        try (Scanner row = new Scanner(Paths.get(file))){
            while (row.hasNextLine()) {                
                String[] val = row.nextLine().split(",");
                names.add(val[0]);
                year.add(val[1]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ", age: " + year.get(i) + " years");
        }
    }
}
