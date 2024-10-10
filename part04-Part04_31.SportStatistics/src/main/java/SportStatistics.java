
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner text = new Scanner(Paths.get(file))) {
            while (text.hasNextLine()) {
                String[] word = text.nextLine().split(",");

                if (word[0].equals(team) || word[1].equals(team)) {
                    games++;
                }

                if ((word[0].equals(team) && (Integer.valueOf(word[2]) > Integer.valueOf(word[3])))
                     ||
                    (word[1].equals(team) && (Integer.valueOf(word[3]) > Integer.valueOf(word[2]))) 
                    ) {
                    wins++;
                }
                
                losses = games - wins;

            }
        } catch (Exception e) {
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
