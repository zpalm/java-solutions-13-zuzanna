package pl.coderstrust.figures;

public class Triangle implements Figure {
    private double height;
    private double base;

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.height = height;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.base = base;
    }

    public Triangle(double height, double base) {
        if (height <= 0 || base <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.height = height;
        this.base = base;
    }

    public double calculateArea() {
        return (this.base * this.height) / 2;
    }
}
