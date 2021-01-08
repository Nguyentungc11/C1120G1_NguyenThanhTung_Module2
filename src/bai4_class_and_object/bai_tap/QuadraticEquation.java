package bai4_class_and_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double  getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiêm.");
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("phương trình có một nghiêm x = " + -quadraticEquation.getB()/(2*quadraticEquation.getA()));
        }else {
            System.out.println("phương trình có 2 nghiêm: " + quadraticEquation.getRoot1()+" và " + quadraticEquation.getRoot2());
        }
    }
}