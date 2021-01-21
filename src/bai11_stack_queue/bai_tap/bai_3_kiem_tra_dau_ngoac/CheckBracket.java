package bai11_stack_queue.bai_tap.bai_3_kiem_tra_dau_ngoac;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)=='('){
                stack.push(string.charAt(i));
            }
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ')'){
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "a+b()";
        System.out.println(checkBracket(string));
    }
}
