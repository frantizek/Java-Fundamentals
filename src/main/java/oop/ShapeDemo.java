/**
 * A class to demonstrate abstraction using the Shape interface.
 * Creates instances of Circle and Rectangle and calculates their areas.
 */
public class ShapeDemo {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Calculate and print areas
        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
    }
}