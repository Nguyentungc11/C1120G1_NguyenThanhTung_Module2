package Bai2_Loop.Bai_tap;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("Menu");
            System.out.println("1.Print rectangle.");
            System.out.println("2.print square triangle.");
            System.out.println("3.Print isosceles triangle");
            System.out.println("Exit.");
            System.out.println("Enter your Choice");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    for(int i = 0;i < 3; i++){
                        for(int j =0; j < 10; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i = 0; i <=5; i++){
                        for( int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 3:
                    for(int i = 0; i < 5; i++){
                        for(int j = 5; j >= i; j--){
                            System.out.print(" ");
                        }
                        for(int k = 0; k <= i; k ++){
                            System.out.print("*");
                        }
                        for(int m = 1; m <= i; m++){
                            System.out.print("*");
                        }
                        for(int n = 5; n >= i; n--) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Input wrong");
            }
        }
    }
}
