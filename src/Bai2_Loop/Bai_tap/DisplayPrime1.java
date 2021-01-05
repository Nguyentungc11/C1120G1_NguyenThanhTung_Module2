package Bai2_Loop.Bai_tap;

import java.util.Scanner;

public class DisplayPrime1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nhập giới hạn: ");
        n = input.nextInt();
        int count = 0;
        int num = 2;
        while (num < n) {
            count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if(count == 2){
                System.out.println(num);
            }
            num++;
        }
    }
}

