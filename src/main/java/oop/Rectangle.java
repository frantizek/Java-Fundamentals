/**
 * A class representing a Rectangle that implements the Shape interface.
 * Calculates area using the formula: length * width.
 */

 public class Rectangle implements Shape {
    private double lenght;
    private double width;

    /**
     * Constructor to initialize the Rectangle with lenght and width.
     * @param lenght the lenght of the rectangle
     * @param width the width of the rectangle 
     */
    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return lenght * width;
    }    

}
