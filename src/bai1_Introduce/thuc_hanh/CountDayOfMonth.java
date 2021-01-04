package bai1_Introduce.thuc_hanh;

import java.util.Scanner;

public class CountDayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month do you want to count day: ");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("February has 28 or 29 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("These month have 30 days.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("These month have 31 days.");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
