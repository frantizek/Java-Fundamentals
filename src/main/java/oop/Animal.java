/**
 * A base class representing an Animal with a generic behavior.
 * This class is intended to be extended by specific animal types.
 */
public class Animal {
    /**
     * A method to make a generic sound for an animal.
     * Subclasses can override this to provide specific sounds.
     */
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}