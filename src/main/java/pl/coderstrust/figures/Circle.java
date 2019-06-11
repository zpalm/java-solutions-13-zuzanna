package pl.coderstrust.figures;

public class Circle implements Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }
}
