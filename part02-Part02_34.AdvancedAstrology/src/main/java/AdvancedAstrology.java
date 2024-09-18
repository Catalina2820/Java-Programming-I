
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String star = "";
        while (number > 0) {
            star += "*";
            number--;
        }
        System.out.println(star);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String texto = "";
        while (number > 0) {
            texto += " ";
            number--;
        }
        System.out.print(texto);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int sp = size - 1;
        int i = 1;
        while (i <= size) {
            printSpaces(sp);
            printStars(i);
            sp--;
            i++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i - 1));
            i++;
        }
 
       
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
