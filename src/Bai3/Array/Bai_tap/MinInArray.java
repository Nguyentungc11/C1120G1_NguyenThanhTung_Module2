package Bai3.Array.Bai_tap;

public class MinInArray {
    public static void main(String[] args) {
        int[] array = {4, 9, 3, 1, 5, 7};
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Min element in this array is: " + min +" at position " + index);
    }         
}
