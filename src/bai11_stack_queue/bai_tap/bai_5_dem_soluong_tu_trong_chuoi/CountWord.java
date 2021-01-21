package bai11_stack_queue.bai_tap.bai_5_dem_soluong_tu_trong_chuoi;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();
        String[] word = string.split("-");
//        for (int i = 0; i < word.length; i++) {
//            System.out.println(word[i]);
 //       }

        TreeMap<String,Integer> map = new TreeMap<>();
        Integer value = 1;
        for (String word1: word) {
            if (!map.containsKey(word1)){
                map.put(word1,value);
            }else {
                map.put(word1,value++);
            }
        }
    }
}
