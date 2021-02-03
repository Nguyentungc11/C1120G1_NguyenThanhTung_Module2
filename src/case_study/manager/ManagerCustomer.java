package case_study.manager;

import case_study.commons.ComparAgeAndBirthDay;
import case_study.commons.FuncWriteAndRead;
import case_study.commons.Validation;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    static Scanner scanner = new Scanner(System.in);
    static Validation validation = new Validation();
    public static void addNewCustomer(){
        List<Customer> customerList = new ArrayList<>();
        String nameCustomer;
        String dayOfBirth;
        String gender;
        String idCard;
        String phoneNumber;
        String email;
        String typeCustomer;
        String address;
        String serviceId;
        do {
            System.out.print("Enter name of customer: ");
            nameCustomer = scanner.nextLine();
        }while (!validation.checkNameCustomer(nameCustomer));
        do {
            System.out.print("Enter day of birth: ");
            dayOfBirth = scanner.nextLine();
        }while (!validation.checkBirthDay(dayOfBirth));
        String checkGender="";
        do {
            System.out.print("Enter gender: ");
            gender = scanner.nextLine();
            checkGender = gender.substring(0,1).toUpperCase() + gender.substring(1,gender.length()).toLowerCase();
        }while (!validation.checkGender(checkGender));
        do {
            System.out.print("Enter idCard: ");
            idCard = scanner.nextLine();
        }while (!validation.checkIdCustomer(idCard));
        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
        }while (!validation.checkEmail(email));

        System.out.print("Enter type customer: ");
        typeCustomer = scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
        System.out.print("Enter service id: ");
        serviceId = scanner.nextLine();
        Customer customer = new Customer(nameCustomer,dayOfBirth,checkGender,idCard,phoneNumber,email,typeCustomer,address,serviceId);
        customerList.add(customer);
        FuncWriteAndRead.writeCustomer(customerList, true);
    }
    public static void showListCustomer() {
        List<Customer> list = FuncWriteAndRead.readCustomer();
        list.sort(new ComparAgeAndBirthDay());
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". "+list.get(i).showInfo());
        }
    }
}
