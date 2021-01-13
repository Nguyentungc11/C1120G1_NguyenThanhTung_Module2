package bai7_abstrach_interface.baitap.bai_1;

public class Rectangle extends Shape {
    public double width = 0.0d;
    public double height = 0.0d;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle has: " +
                " width = " + width +
                ", height = " + height +
                ", color = '" + color + '\'' +
                ", filled = " + filled + " " + ", Area " +
                getArea();
    }
}
