package Bai3.Array.Bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
       int [] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = scanner.nextInt();
        }
        boolean flag = false;
        do {
            System.out.println("\n Enter the element you want to add: ");
            int x = scanner.nextInt();
            System.out.println("Enter index you want to add in:");
            int index = scanner.nextInt();
            if (index < 0 || index > array.length) {
                System.out.println("Index invalid");
                flag = true;
            } else {
                System.out.println("array before add: ");
                for (int i = 0; i < 5; i++) {
                    System.out.print(array[i] + "\t");
                }
                System.out.println("\n");
                int[] array1 = new int[6];
                for (int i = 0; i < index; i++) {
                    array1[i] = array[i];
                }
                array1[index] = x;
                for (int i = index + 1; i < array1.length; i++) {
                    array1[i] = array[i - 1];
                }
                System.out.println("Array after add:");
                for (int i = 0; i < array1.length; i++) {
                    System.out.print(array1[i] + "\t");
                }
                flag = false;

            }
        }while (flag);
    }
}
