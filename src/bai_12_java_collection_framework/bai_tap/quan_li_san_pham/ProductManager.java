package bai_12_java_collection_framework.bai_tap.quan_li_san_pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<>();

    public void addProduct(String name,int id, float price){
        Product newProduct = new Product(name, id, price);
        listProduct.add(newProduct);
    }
}
