package bai7_abstrach_interface.baitap.bai_2;

import bai7_abstrach_interface.baitap.bai_1.Shape;

public class Square1 extends Shape implements Colorable {
    private float side;

    public Square1(String color, boolean filled, float side) {
        super(color, filled);
        this.side = side;
    }

    public Square1(String color, boolean filled) {
        super(color, filled);
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }
}
