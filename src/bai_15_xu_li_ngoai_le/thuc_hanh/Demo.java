package bai_15_xu_li_ngoai_le.thuc_hanh;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            nhap();
        } catch (LoiNhap loiNhap) {
            System.out.println(loiNhap.getMessage());
        }
        System.out.println("ket thuc");
    }
    public static void nhap() throws LoiNhap {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
            int a = scanner.nextInt();
        if (a< 0){
            throw new LoiNhap("Loi nhap nho hon 0");
        }

        System.out.println("so vua nhap: " + a);
    }


    }
