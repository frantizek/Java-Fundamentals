/**
 * A class representing a Circle that implements the Shape interface.
 * Calculates area using the formula: π * radius^2.
 */

 public class Circle implements Shape {
    private double radius;

    /**
     * Constructor to initialize the Circle with a radius.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }    

}
