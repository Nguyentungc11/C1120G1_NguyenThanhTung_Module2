package Bai2_Loop.Thuc_hanh;

import java.util.Scanner;

public class Nsdsdfdf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int num = 1;
        System.out.println("nhập khoảng: ");
        n = scan.nextInt();
        while (num <= n){
            int count = 0;
            for(int i = 1;i<=num;i++){
                if(num % i ==0){
                    count++;
                }

                }
            if(count ==2){
                System.out.println(num + " là số nt");
            }else {
                System.out.println(num + " không phải snt");
            }
            num++;
        }

    }
}
