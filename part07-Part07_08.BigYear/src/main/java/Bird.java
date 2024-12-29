
public class Bird {
    private String name;
    private String latin;
    private int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }
    
    public void addObservation(){
        this.observation ++;
    }

    @Override
    public String toString() {
        return name + " (" + latin + "): " + observation + " observations";
    }
    
}
