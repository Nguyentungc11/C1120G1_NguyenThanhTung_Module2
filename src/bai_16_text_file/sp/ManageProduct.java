package bai_16_text_file.sp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageProduct {
    public void addNewProduct(){
        Scanner scanner = new Scanner(System.in);
        Product product = new Product("2","tung2",12);
        FuncWriteAndRead.writeProduct(product);
    }
    public void show(){
        List<Product> list = new ArrayList<>();
        list = FuncWriteAndRead.readProduct();
        for (Product p: list) {
            System.out.println(p);
        }
    }
}
