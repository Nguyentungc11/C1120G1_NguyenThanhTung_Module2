package bai7_abstrach_interface.baitap.bai_1;

public class Circle extends Shape {
    public double radius = 0.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle has: " +
                " radius = " + radius +
                ", color = " + color + ' ' +
                ", filled = " + filled + ", " + " Area = " +
                getArea();
    }
}
