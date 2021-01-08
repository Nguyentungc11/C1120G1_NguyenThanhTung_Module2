package Bai3.Array.Bai_tap;

import java.util.Scanner;

public class MaxInDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array 1: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of elements in array 2: ");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element " + "array[" + i + "][" + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int[] array1 : array) {
            for (int element : array1) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println("Max element in array is " + max);

    }
}
