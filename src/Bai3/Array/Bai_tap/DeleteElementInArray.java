package Bai3.Array.Bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 5, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element you want to delete: ");
        int x = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Element " + x + " at position " + i);
                check = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }

        if (!check) {
            System.out.println("không có trong mảng");
        }
        if (check) {
            System.out.println("Array after delete: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }

        }
    }
}
