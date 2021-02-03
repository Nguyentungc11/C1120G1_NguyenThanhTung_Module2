package test.quanlisanpham;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerProduct list = new ManagerProduct();
        int choice;
        boolean menuFlag = true;

        while (menuFlag){
            System.out.println("MENU\n 1. Add \n 2.Show \n 3.Edit \n 4.Search \n 5.Sort \n 6.Delete \n 0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    int id;
                    String name;
                    float price;
                    System.out.print("Enter Id: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    price = Float.parseFloat(scanner.nextLine());
                    ManagerProduct.add(name,id,price);
                    break;
                case 2:
                    ManagerProduct.show();
                    break;
                case 3:
                    System.out.print("Enter Id you want to edit: ");
                    int editId;
                    editId = Integer.parseInt(scanner.nextLine());
                    ManagerProduct.edit(editId);
                    break;
                case 4:
                    System.out.print("Enter name you want to search: ");
                    String searchName;
                    searchName = scanner.nextLine();
                    ManagerProduct.search(searchName);
                    break;
                case 5:
                    ManagerProduct.sort();
                    break;
                case 6:
                    ManagerProduct.show();
                    System.out.print("Choose product to delete: ");
                    int indexDelete;
                    indexDelete = Integer.parseInt(scanner.nextLine());
                    ManagerProduct.delete(indexDelete);
                    ManagerProduct.show();
                    break;
                case 0:
                    menuFlag = false;
                    break;
                default:
                    System.out.println("Failed");
                    break;
            }
        }
    }
}
