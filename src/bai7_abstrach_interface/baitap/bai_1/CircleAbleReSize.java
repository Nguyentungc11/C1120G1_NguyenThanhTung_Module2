package bai7_abstrach_interface.baitap.bai_1;

public class CircleAbleReSize extends Circle implements ReSizeAble {

    public CircleAbleReSize(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {
        setRadius(this.getRadius() + this.getRadius()*percent/100);
    }
}

