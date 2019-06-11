package pl.coderstrust.figures;

public class Rectangle implements Figure {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }
}
