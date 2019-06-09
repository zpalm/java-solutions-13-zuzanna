package pl.coderstrust.figures;

public class Square extends Rectangle implements Figure {

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Value can't be lower or equal to zero.");
        } else {
            super.setWidth(side);
            super.setLength(side);
        }
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double calculateArea() {
        return super.calculateArea();
    }
}
