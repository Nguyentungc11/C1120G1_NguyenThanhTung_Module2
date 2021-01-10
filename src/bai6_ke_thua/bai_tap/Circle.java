package bai6_ke_thua.bai_tap;

public class Circle {
    private double radius = 5.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle has " +
                "radius = " + radius +
                ", color='" + color + "Area :" + getArea();
    }
}
