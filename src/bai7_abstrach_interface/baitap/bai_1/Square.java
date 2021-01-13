package bai7_abstrach_interface.baitap.bai_1;

public class Square extends Shape {
    public double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "Square has: " +
                " side = " + side +
                ", color = " + color +
                ", filled = " + filled + ", Area " +
                getArea();
    }
}
