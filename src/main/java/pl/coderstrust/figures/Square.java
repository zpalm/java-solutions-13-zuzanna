package pl.coderstrust.figures;

public class Square implements Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.side = side;
    }

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}
