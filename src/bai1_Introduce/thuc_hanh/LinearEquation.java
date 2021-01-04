package bai1_Introduce.thuc_hanh;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a;
        float b;
        float c;
        System.out.println("Enter a: ");
        a = scan.nextFloat();
        System.out.println("Enter b: ");
        b = scan.nextFloat();
        System.out.println("Enter c: ");
        c = scan.nextFloat();
        if (a != 0) {
            System.out.println("x is " + (c - b) / a);
        } else if (b == 0 && c == 0) {
            System.out.println("Everything x is ok");
        } else if (b == 0 && c != 0) {
            System.out.println("Everything x is not ok");
        }
    }
}
