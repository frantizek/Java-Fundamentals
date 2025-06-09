/**
 * A class representing a Person with basic attributes like name and age.
 * Demonstrates encapsulation by using private fields with public getters and setters.
 */
public class Person {
    // Private fields to ensure encapsulation
    private String name;
    private int age;

    /**
     * Constructor to initialize a Person object with a name and age.
     * @param startName The initial name of the person.
     * @param startAge  The initial age of the person.
     */
    public Person(String startName, int startAge) {
        this.name = startName;
        this.age = startAge;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
