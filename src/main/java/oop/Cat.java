/**
 * A subclass of Animal representing a Dog.
 * Overrides the makeSound() method to produce a dog-specific sound.
 */
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}