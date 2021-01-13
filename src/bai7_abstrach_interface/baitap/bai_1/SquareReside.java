package bai7_abstrach_interface.baitap.bai_1;

public class SquareReside extends Square implements ReSizeAble {

    public SquareReside(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide()*percent/100));

    }
}
