
public class HealthStation {
    
    private int numberOfWeighings;

    public HealthStation(int numberOfWeighings) {
        this.numberOfWeighings = numberOfWeighings;
    }
        
    public HealthStation() {
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numberOfWeighings += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        int increase = person.getWeight() + 1;
        person.setWeight(increase);
    }
    
    public int weighings(){
        return this.numberOfWeighings;
    }
}
