package bai7_abstrach_interface.baitap.bai_1;

public class AbleResideTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CircleAbleReSize("black", true,2);
        shapes[1] = new RectangleReside("blue",true,5,10);
        shapes[2] = new SquareReside("red",false,4);
        for(Shape shape: shapes){
            long percent = Math.round(99 * Math.random());
            System.out.println(shape);
            ReSizeAble reSizeAbleShape;
            if(shape instanceof CircleAbleReSize){
                reSizeAbleShape = (CircleAbleReSize) shape;
            }else if(shape instanceof RectangleReside){
                reSizeAbleShape = (RectangleReside) shape;

            }else {
                reSizeAbleShape = (SquareReside) shape;
            }
            reSizeAbleShape.resize(percent);
            System.out.println(" Increase = " + percent + "%, " + "\n" + " After reside: \n" +  reSizeAbleShape);
        }

    }
}
