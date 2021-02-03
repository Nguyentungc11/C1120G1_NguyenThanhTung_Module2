package bai_12_java_collection_framework.bai_tap.quan_li_san_pham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
   static ArrayList<Product> listProduct = new ArrayList<>();
   static {
       listProduct.add(new Product("nokia",1,10.0f));
       listProduct.add(new Product("samsung",2,10.0f));
       listProduct.add(new Product("iphone",3,10.0f));
       listProduct.add(new Product("vsmart",4,10.0f));
       listProduct.add(new Product("vertu",5,10.0f));
   }

    public static void addProduct(Product product){
        listProduct.add(product);
    }
    public static void showProduct(){
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println((i + 1) + "."+listProduct.get(i).toString());
        }

    }
    public static void editProduct(int id){
       Scanner scanner = new Scanner(System.in);
       for(Product product : listProduct){
           if (id == product.getProductId()){
               System.out.println("Enter a new name ");
               String editName = scanner.nextLine();
               product.setProductName(editName);
               break;
           }
       }
    }
    public static String getListProduct(){
       String str = "";
        for (int i = 0; i < listProduct.size(); i++) {
            str += i+ ". "+listProduct.get(i).toString();
        }
       return str;
    }
}
