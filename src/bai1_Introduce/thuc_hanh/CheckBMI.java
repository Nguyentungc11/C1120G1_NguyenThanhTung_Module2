package bai1_Introduce.thuc_hanh;

import java.util.Scanner;

public class CheckBMI {
    public static void main(String[] args) {
        float weight;
        float height;
        float bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight(in kilogram): ");
        weight = scanner.nextFloat();
        System.out.println("Enter your height(in meter): ");
        height = scanner.nextFloat();
        bmi = (float) (weight/Math.pow(height,2));
//        if(bmi < 18.5){
//            System.out.println("You are underweight.");
//        }else if(bmi < 25){
//            System.out.println("You are normal");
//        }else if(bmi < 30){
//            System.out.println("You are over weight");
//        }else {
//            System.out.println("You are obese");
//        }
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
