package test.quanlisanpham;

import bai_12_java_collection_framework.bai_tap.quan_li_san_pham.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerProduct {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product1> listProduct1 = new ArrayList<>();
    static {
        listProduct1.add(new Product1("samsung",1,10));
        listProduct1.add(new Product1("iphone",2,11));
        listProduct1.add(new Product1("nokia",3,12));
    }
    public static void add(String name, int id, float price){
        Product1 product1 = new Product1(name,id,price);
        listProduct1.add(product1);

    }
    public static void show(){
        for (int i = 0; i < listProduct1.size(); i++) {
            System.out.println(i+". "+listProduct1.get(i));
        }
    }
    public static void edit(int id){
        for(Product1 product1 : listProduct1){
            if (id == product1.getId()){
                String editName;
                float editPrice;
                System.out.print("Enter new name: ");
                editName = scanner.nextLine();
                System.out.print("Enter new price: ");
                editPrice = Float.parseFloat(scanner.nextLine());
                product1.setName(editName);
                product1.setPrice(editPrice);
            }
        }
    }
    public static void search(String name){
        boolean searchFlag = true;
        for(Product1 product1 : listProduct1){
            if (product1.getName().equals(name)){
                System.out.println(product1);
                searchFlag = false;
            }
        }
        if (searchFlag){
            System.out.println("Not found "+name);
        }
    }
    public static void sort(){
        Collections.sort(listProduct1);
        show();
    }
    public static void delete(int index){
        for (int i = 0; i < listProduct1.size(); i++) {
            if (index == i){
                listProduct1.remove(index);
                break;
            }
        }
    }
}
