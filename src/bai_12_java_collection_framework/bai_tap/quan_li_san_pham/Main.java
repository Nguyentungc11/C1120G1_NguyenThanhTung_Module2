package bai_12_java_collection_framework.bai_tap.quan_li_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager list = new ProductManager();

        int id;
        String productName;
        float productPrice;
        System.out.println("Enter the product id : ");
        id = scanner.nextInt();
        System.out.println("Enter name: ");
        productName = scanner.nextLine();
        System.out.println("Enter price: ");
        productPrice = scanner.nextFloat();

        list.addProduct(productName, id, productPrice);



    }
}
