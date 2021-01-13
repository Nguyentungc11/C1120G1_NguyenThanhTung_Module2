package bai7_abstrach_interface.baitap.bai_2;

import bai7_abstrach_interface.baitap.bai_1.Circle;
import bai7_abstrach_interface.baitap.bai_1.Rectangle;
import bai7_abstrach_interface.baitap.bai_1.Shape;

public class TestColorAble {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue",false,10);
        shapes[1] = new Rectangle("red",true,10,20);
        shapes[2] = new Square1("black",true,5);
        for (Shape shape:shapes) {
            Colorable colorable;
            if(shape instanceof Circle){
                System.out.println("Area of circle = " + shape.getArea());
            }else if(shape instanceof Rectangle){
                System.out.println("Area of rectangle = " + shape.getArea());
            }else {
                System.out.println("Area of square = " + shape.getArea());
                ((Square1) shape).howToColor();
            }
        }
    }

}
