package pl.coderstrust.figures;

public class Trapezoid implements Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }

    public void setTopBase(double topBase) {
        if (this.bottomBase == topBase) {
            throw new IllegalArgumentException("Bottom and lower base must be of different value");
        } else if (topBase <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.topBase = topBase;
    }

    public void setBottomBase(double bottomBase) {
        if (bottomBase == this.topBase) {
            throw new IllegalArgumentException("Bottom and lower base must be of different value");
        } else if (bottomBase <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.bottomBase = bottomBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Trapezoid(double topBase, double bottomBase, double height) {
        if (bottomBase == topBase) {
            throw new IllegalArgumentException("Bottom and lower base must be of different value");
        } else if (topBase <= 0 || bottomBase <= 0 || height <= 0) {
            throw new IllegalArgumentException("Value must be positive.");
        }
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    public double calculateArea() {
        return ((this.bottomBase + this.topBase) * this.height) / 2;
    }
}
