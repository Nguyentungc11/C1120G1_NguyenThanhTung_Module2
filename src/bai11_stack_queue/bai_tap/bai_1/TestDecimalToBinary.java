package bai11_stack_queue.bai_tap.bai_1;

import bai11_stack_queue.bai_tap.bai_1.DecimalToBinary;

public class TestDecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        int decimal = 152;
        System.out.println("Số thập phân: " + decimal);
        System.out.println("Số nhị phân: ");
        decimalToBinary.convertToBinary(decimal);
    }
}
