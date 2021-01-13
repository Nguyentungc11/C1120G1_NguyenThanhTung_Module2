package bai7_abstrach_interface.baitap.bai_1;

public class RectangleReside extends Rectangle implements ReSizeAble{

    public RectangleReside(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight() + getHeight()*percent/100);
        setWidth(getWidth() + getWidth()*percent/100);
    }
}
