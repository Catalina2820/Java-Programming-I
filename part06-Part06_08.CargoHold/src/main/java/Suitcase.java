
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int max;

    public Suitcase(int max) {
        items = new ArrayList<>();
        this.max = max;
    }

    public int totalWeight() {

        if (items.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public void addItem(Item item) {

        if ((totalWeight() + item.getWeight()) <= max) {
            items.add(item);
        }
    }
    
    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        
        if (items.isEmpty()) {
            return null;
        }
        
        Item heavItem = items.get(0);
        int max = items.get(0).getWeight();
        
        for (Item item : items) {
            if (max < item.getWeight()) {
                max = item.getWeight();
                heavItem = item;
            }
        }
        
        return heavItem;
    }

    @Override
    public String toString() {

        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }

}
