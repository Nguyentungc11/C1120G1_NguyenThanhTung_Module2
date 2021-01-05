package Bai2_Loop.Bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int count = 0;
        int count1 = 0;
        int num = 2;
        System.out.println("Nhập số lượng số nguyên tố cần in ra:");
        n = input.nextInt();
        while(count1 < n){
            count = 0;
//            boolean check = true;
            for(int i = 1; i<= num;i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count ==2){
                System.out.println(num);
                count1++;
            }
            num++;
        }

    }
}
