package bai_13_thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class BinarySearch {
    static int searchBinary (int[] list, int key){
        int low = 0;
        int high = list.length -1;

        while (high >= low){
            int mid = (low + high)/2;
            if (key == list[mid]){
                return mid;
            }else if (key < list[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm : ");
        int key = scanner.nextInt();
        System.out.println(searchBinary(list,key));
    }
}
