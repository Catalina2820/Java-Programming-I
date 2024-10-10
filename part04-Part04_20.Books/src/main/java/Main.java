
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());

            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String info = scan.nextLine();
        
        if (info.equals("everything")) { 
            for (Book book : books) {
                System.out.println(book);
            }
            
        } else if (info.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
         
    }
}
