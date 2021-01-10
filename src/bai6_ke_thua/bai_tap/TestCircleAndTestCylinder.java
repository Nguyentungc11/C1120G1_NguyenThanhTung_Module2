package bai6_ke_thua.bai_tap;

import java.util.Scanner;

public class TestCircleAndTestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
       // Circle circle1 = new Circle(2)
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều cao: ");
        cylinder.setHigh(scanner.nextDouble());
        System.out.print("nhập bán kính: ");
        cylinder.setRadius(scanner.nextDouble());
        System.out.println(cylinder);
    }
}
