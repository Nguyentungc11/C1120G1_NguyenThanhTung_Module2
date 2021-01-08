package bai4_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private  double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public  double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Rectangle {" + "width: " + width + "height" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Nhập chiều cao mới: ");
        double height1 = scanner.nextDouble();
        rectangle.setHeight(height1);
        System.out.println("Nhập chiều rộng mới: ");
        double width1 = scanner.nextDouble();
        rectangle.setWidth(width1);
        System.out.println("Diện tích hình chữ nhật mới: " + rectangle.getArea());
        System.out.println("chu vi hình chữ nhật mới: " + rectangle.getPerimeter());
    }

}
