package bai11_stack_queue.bai_tap.bai_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string you need to check: ");
        String inputString = scanner.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length() - 1; i >=0 ; i--) {
            queue.add(inputString.charAt(i));
        }
        String reservesString = "";
        while (!queue.isEmpty()){
            reservesString += queue.remove();
        }
        if(reservesString.equals(inputString)){
            System.out.println("InputString is palindrome.");
        }
        else {
            System.out.println("InputString is not palindrome.");
        }

    }
}
