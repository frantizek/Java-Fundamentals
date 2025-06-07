/**
 * A subclass of Animal representing a Dog.
 * Overrides the makeSound() method to produce a dog-specific sound.
 */
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}