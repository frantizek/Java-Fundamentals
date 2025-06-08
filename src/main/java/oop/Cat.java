/**
 * A subclass of Animal representing a Cat.
 * Overrides the makeSound() method to produce a cat-specific sound.
 */
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}