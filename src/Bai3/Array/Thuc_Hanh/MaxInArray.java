package Bai3.Array.Thuc_Hanh;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter size of array");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size is not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("Elements list:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t" + "\n");
        }
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("Max element in array is " + max + " at position " + index);
    }
    public static void hello(){
        System.out.println("hello");
    }
}
