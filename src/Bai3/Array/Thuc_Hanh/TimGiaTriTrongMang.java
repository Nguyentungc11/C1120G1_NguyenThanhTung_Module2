package Bai3.Array.Thuc_Hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Thuần", "Đức", "Quang", "Ngọc", "Sang", "Vân", "Đông", "Vi", "Khoa", "Nghĩa"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name's student");
        String inputName = scanner.nextLine();
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of " + inputName + " in the list  is " + (i + 1));
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("Not found" + inputName + " in the list");
        }
    }
}
