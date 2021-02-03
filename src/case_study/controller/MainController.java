package case_study.controller;

import case_study.manager.ManagerCustomer;
import case_study.manager.ManagerService;

import java.util.Scanner;

public class MainController {
    static ManagerService managerService = new ManagerService();
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        while (true) {
            System.out.println("1.	Add New Services \n" +
                    "2.	Show Services \n" +
                    "3.	Add New Customer \n" +
                    "4.	Show Information of Customer \n" +
                    "5.	Add New Booking \n" +
                    "6.	Show Information of Employee \n" +
                    "7.	Exit");
            int choice;
            System.out.print("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    ManagerCustomer.addNewCustomer();
                    break;
                case 4:
                    ManagerCustomer.showListCustomer();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }
    }

    public static void addService() {
        System.out.println("1.Add villa \n 2.Add house \n 3.Add room \n 4.Back to menu \n 5.Exit.");
        System.out.print("Input type of service you want to add: ");
        int choiceService;
        choiceService = Integer.parseInt(scanner.nextLine());
        switch (choiceService) {
            case 1:
                managerService.addVilla();
                break;
            case 2:
                managerService.addHouse();
                break;
            case 3:
                managerService.addRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Input invalid.");
                break;
        }
    }

    public static void showService() {
        System.out.println("1.Show all villa \n 2.Show all house \n 3.Show all room \n 4.Back to menu \n 5.Exit.");
        System.out.print("Input type of service you want to show: ");
        int choiceService;
        choiceService = Integer.parseInt(scanner.nextLine());
        switch (choiceService) {
            case 1:
                managerService.showListVilla();
                break;
            case 2:
                managerService.showListHouse();
                break;
            case 3:
                managerService.showListRoom();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Input is invalid");
                break;
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}


