package bai_12_java_collection_framework.bai_tap.quan_li_san_pham;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) { ;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input choice: \n 1.Add \n 2.Display  \n 3.Edit  \n 4.Sort   \n 5.Search  \n 6.Delete");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    ProductManager.showProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
            }

        }
    }

    private static void editProduct() {
       ProductManager.showProduct();
        System.out.println("Enter your Product : ");
        int input = Integer.parseInt(scanner.nextLine());
        int editId = ProductManager.listProduct.get(input).getProductId();
        ProductManager.editProduct(editId);
    }

    private static void addNewProduct() {

        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        float price = Float.parseFloat(scanner.nextLine());
        Product product = new Product(name, id, price);
        ProductManager.addProduct(product);
    }

}
