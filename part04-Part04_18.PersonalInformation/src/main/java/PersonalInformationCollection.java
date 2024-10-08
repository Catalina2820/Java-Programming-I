
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.println("First name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Last name: ");
            String apellido = scanner.nextLine();
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(name, apellido, id));     
        }

        for (PersonalInformation item : infoCollection ){
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }
    }
}
