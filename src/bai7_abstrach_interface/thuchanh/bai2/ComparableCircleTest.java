package bai7_abstrach_interface.thuchanh.bai2;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        CircleExtend[] circles = new CircleExtend[5];
        circles[0] = new CircleExtend(3.7, "indigo", false);
        circles[1] = new CircleExtend(3.5, "Andigo", true);
        circles[2] = new CircleExtend(3.9, "Gndigo", true);
        circles[3] = new CircleExtend(3.9, "Gndigo", true);
        circles[4] = new CircleExtend(3.9, "Gndigo", false);

        System.out.println("Pre-sorted:");
        for (CircleExtend circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted by color:");
        for (CircleExtend circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles,new CompareByRadius());

        System.out.println("After-sorted by radius:");
        for (CircleExtend circle : circles) {
            System.out.println(circle);
        }
    }
}
