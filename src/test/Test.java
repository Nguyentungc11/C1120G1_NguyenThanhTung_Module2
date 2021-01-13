package test;

import bai7_abstrach_interface.baitap.bai_1.CircleAbleReSize;
import bai7_abstrach_interface.baitap.bai_1.RectangleReside;
import bai7_abstrach_interface.baitap.bai_1.Shape;
import bai7_abstrach_interface.baitap.bai_1.SquareReside;

public class Test {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new CircleAbleReSize("black", true,2);
        shapes[1] = new RectangleReside("blue",true,5,10);
        shapes[2] = new SquareReside("red",false,4);
        for (Shape shape1 : shapes) {
            System.out.println(shape1);
        }
//        CircleAbleReSize  circleAbleReSize = new CircleAbleReSize("red",true,10);
//        System.out.println("Before reside: " + circleAbleReSize);
//        long percent = Math.round(99 * Math.random());
//        circleAbleReSize.resize(percent);
//        System.out.println(circleAbleReSize);
//       staff staff1 = new staff("tung",30);
//        System.out.println(staff1.getName() + staff1.getAge() + staff1.getL());
//        Director director = new Director("dung",24);
//        Director director1= new Director();
//        System.out.println(director.getName() + director.getL());
//        System.out.println();
//        staff1 = new Director();
//        System.out.println(staff1.getL());
//        director1 = (Director)staff1;
//        System.out.println(staff1.getL());
//        System.out.println(director1.getL());
    }
}
