
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {

        if (people.isEmpty()) {
            return null;
        }

        Person theShortest = people.get(0);
        int height = people.get(0).getHeight();

        for (Person person : people) {
            if (height > person.getHeight()) {
                height = person.getHeight();
                theShortest = person;
            }
        }
        return theShortest;
    }

    public Person take() {
        Person shortestPerson = shortest();
        this.people.remove(shortestPerson);
        return shortestPerson;
    }
    
}
