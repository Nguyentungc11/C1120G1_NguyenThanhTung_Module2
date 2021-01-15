package bai11_stack_queue.bai_tap.bai_1;

import java.util.Stack;

public class DecimalToBinary {
    public void convertToBinary(int num){
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0){
           int balance = num % 2;
           stack.push(balance);
           num /= 2;
        }
        while (!(stack.isEmpty())){
            System.out.println(stack.pop());
        }
    }
}
