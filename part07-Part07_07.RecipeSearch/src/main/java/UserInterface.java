
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanM;

    public UserInterface(Scanner scanM) {
        this.scanM = scanM;
    }

    public void start() {

        System.out.print("File to read: ");
        String file = scanM.nextLine();

        ArrayList<Recipe> recipes = recipeFiller(file);

        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient"
        );

        while (true) {
            System.out.print("Enter command: ");
            String comando = scanM.nextLine();
            String word;
            
            switch (comando) {
                case "stop":
                    return;
                    
                case "list":
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        System.out.println(recipe.toString());
                    }
                    break;
                    
                case "find name":
                    System.out.print("Searched word:");
                    word = scanM.nextLine();
                    System.out.println("Recipes:");
                    recipeByName(word, recipes);
                    break;
                    
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    word = scanM.nextLine();
                    System.out.println("Recipes:");
                    recipeByCookingTime(word, recipes);
                    break;
                    
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    word = scanM.nextLine();
                    System.out.println("Recipes:");
                    recipeByIngredients(word, recipes);
                    break;
            }
        }

    }

    public ArrayList<Recipe> recipeFiller(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(file))) {

            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int time = Integer.valueOf(scan.nextLine());
                ArrayList<String> elements = new ArrayList<>();

                while (scan.hasNextLine()) {
                    String ingredient = scan.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    elements.add(ingredient);
                }

                recipes.add(new Recipe(name, time, elements));
            }

        } catch (Exception e) {
            System.out.println("file not found");
        }

        return recipes;
    }

    public void recipeByName(String name, ArrayList<Recipe> recipes) {
        ArrayList<String> lista = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe.toString());
            }
        }

    }
    
    public void recipeByCookingTime(String word, ArrayList<Recipe> recipes){
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= Integer.valueOf(word)) {
                System.out.println(recipe.toString());
            }
        }
    }

    public void recipeByIngredients(String word, ArrayList<Recipe> recipes) {

        for (Recipe recipe : recipes) {
            for (int i = 0; i < recipe.getIngredients().size(); i++) {
                if (recipe.getIngredients().get(i).equals(word)) {
                    System.out.println(recipe.toString());
                    continue;
                }
            }
        }
    }
}
