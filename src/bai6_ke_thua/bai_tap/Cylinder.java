package bai6_ke_thua.bai_tap;

public class Cylinder extends Circle {
    private double high;

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder() {
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getVolume(){
        return getArea()*this.high;
    }

    @Override
    public String toString() {
        return "Cylinder has " + " radius " + getRadius() +
                " high = " + high + " Volume: " + getVolume() +
                '}';
    }
}
