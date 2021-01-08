package Bai3.Array.Bai_tap;

public class CombineTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9};
        int[]array = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[array1.length + i] = array2[i];
        }
        System.out.println("Array after combine:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
