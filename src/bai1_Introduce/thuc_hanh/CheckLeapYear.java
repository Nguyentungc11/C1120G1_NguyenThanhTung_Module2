package bai1_Introduce.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check:");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                }else {
                    System.out.printf("%d is not a leap year.", year);
                }
            }else {
                System.out.printf("%d is a leap year", year);
            }
        }else {
            System.out.printf("%d is not a leap year.", year);
        }
        }
    }

