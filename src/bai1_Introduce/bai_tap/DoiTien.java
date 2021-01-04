package bai1_Introduce.bai_tap;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input money in USD");
        float usd = scanner.nextFloat();
        float vnd = usd*23000;
        System.out.println("Money in VND: " + vnd);
    }
}
