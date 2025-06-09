/*
Create a base class Animal with a method makeSound() that prints a generic sound.
Create two subclasses Dog and Cat that override makeSound() to print "Bark" and "Meow," respectively.
In a main method, create objects of Dog and Cat but reference them as Animal type (e.g., Animal dog = new Dog();) and call makeSound().
Goal: Understand inheritance and runtime polymorphism.
*/

/**
 * A class to demonstrate inheritance and polymorphism using Animal and its subclasses.
 * Creates instances of Dog and Cat, and calls their overridden methods.
 */
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create objects of Dog and Cat, but reference them as Animal type
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Call makeSound() on both objects
        System.out.println("Dog sound:");
        dog.makeSound(); // Outputs "Bark"
        
        System.out.println("Cat sound:");
        cat.makeSound(); // Outputs "Meow"
    }
}
