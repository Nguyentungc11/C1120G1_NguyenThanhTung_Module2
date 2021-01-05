package Bai2_Loop.Thuc_hanh;

import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = input.nextDouble();
        System.out.println("Enter month: ");
        month = input.nextInt();
        System.out.println("Enter interest race: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
