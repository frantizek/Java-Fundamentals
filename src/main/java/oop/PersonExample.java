/*
Basic Class and Encapsulation:

Create a Person class with private fields for name (String) and age (int). 
Add public getters and setters, and a constructor to initialize these fields.

Write a main method in a separate class to create a Person object, 
set values, and print them.

Goal: Reinforce encapsulation and basic class structure.
*/

/**
 * A class to demonstrate the usage of the Person class.
 * Creates a Person object, modifies its attributes, and prints the values.
 */
public class PersonExample {
    public static void main(String[] args) {
        // Create a Person object using the constructor
        Person person = new Person("John Doe", 25);
        
        // Print initial values using getters
        System.out.println("Initial Name: " + person.getName());
        System.out.println("Initial Age: " + person.getAge());
        
        // Modify values using setters
        person.setName("Jane Smith");
        person.setAge(30);
        
        // Print updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}