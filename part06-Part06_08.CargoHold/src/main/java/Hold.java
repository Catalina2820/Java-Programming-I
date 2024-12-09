
import java.util.ArrayList;

public class Hold {

    private int max;
    private ArrayList<Suitcase> luggages;

    public Hold(int max) {
        this.max = max;
        luggages = new ArrayList();
    }

    public int totalWeight() {

        if (luggages.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (Suitcase lugagge : luggages) {
            total += lugagge.totalWeight();
        }
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight() + suitcase.totalWeight()) <= max) {
            luggages.add(suitcase);
        }
    }
    
    public void printItems(){
        for (Suitcase luggage : luggages) {
            luggage.printItems();
        }
    }

    @Override
    public String toString() {
        if (luggages.isEmpty()) {
            return "no suitcases (0 kg)";
        } else if (luggages.size() == 1) {
            return luggages.size() + " suitcase (" + totalWeight() + " kg)";
        } else {
            return luggages.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }

}
