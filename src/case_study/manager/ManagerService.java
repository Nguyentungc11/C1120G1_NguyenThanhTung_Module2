package case_study.manager;

import case_study.commons.FuncWriteAndRead;
import case_study.commons.Validation;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    static Scanner scanner = new Scanner(System.in);
    static Validation validation = new Validation();

    public void addVilla() {
        List<Villa> villaList = new ArrayList<>();
        String id;
        String nameService;
        double area;
        double cost;
        int amountOfPeople;
        int numberOfFloors;
        do {
            System.out.print("Enter Id: ");
            id = scanner.nextLine();
        } while (!validation.checkIdVilla(id));
        do {
            System.out.print("Enter name service: ");
            nameService = scanner.nextLine();
        } while (!validation.checkNameOfService(nameService));
        do {
            System.out.print("Enter area can use: ");
            area = Double.parseDouble(scanner.nextLine());
        } while (validation.checkArea(area));
        do {
            System.out.print("Enter cost: ");
            cost = Double.parseDouble(scanner.nextLine());
        } while (validation.checkPrice(cost));
        do {
            System.out.print("Enter amount of people: ");
            amountOfPeople = Integer.parseInt(scanner.nextLine());
        } while (validation.checkNumberPeople(amountOfPeople));
        System.out.print("Enter type rent: ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter standard room: ");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter other facilities: ");
        String otherFacilities = scanner.nextLine();
        System.out.print("Enter area of pool: ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        do {
            System.out.print("Enter number of floor: ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        } while (validation.checkNumberFloor(numberOfFloors));
        Villa villa = new Villa(id, nameService, area, cost, amountOfPeople, typeRent, standardRoom, otherFacilities, poolArea, numberOfFloors);
        villaList.add(villa);
        FuncWriteAndRead.writeVilla(villaList, true);
    }

    public void showListVilla() {
        List<Villa> list = new ArrayList<>();
        list = FuncWriteAndRead.readVilla();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).showInfo();

        }
    }


    public void addHouse() {
        List<House> houseList = new ArrayList<>();
        String id;
        String nameService;
        double area;
        double cost;
        int amountOfPeople;
        int numberOfFloors;
        do {
            System.out.println("Enter Id: ");
            id = scanner.nextLine();
        } while (validation.checkIdHouse(id));
        do {
            System.out.print("Enter name of service: ");
            nameService = scanner.nextLine();
        } while (validation.checkNameOfService(nameService));
        do {
            System.out.print("Enter area can use: ");
            area = Double.parseDouble(scanner.nextLine());
        } while (validation.checkArea(area));
        do {
            System.out.print("Enter cost: ");
            cost = Double.parseDouble(scanner.nextLine());
        } while (validation.checkPrice(cost));
        do {
            System.out.print("Enter amount of people: ");
            amountOfPeople = Integer.parseInt(scanner.nextLine());
        } while (validation.checkNumberPeople(amountOfPeople));
        System.out.print("Enter type rent: ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter standard room: ");
        String standardRoom = scanner.nextLine();
        System.out.print("Enter other facilities: ");
        String otherFacilities = scanner.nextLine();
        do {
            System.out.print("Enter number of floor: ");
            numberOfFloors = Integer.parseInt(scanner.nextLine());
        } while (validation.checkNumberFloor(numberOfFloors));
        House house = new House(id, nameService, area, cost, amountOfPeople, typeRent, standardRoom, otherFacilities, numberOfFloors);
        houseList.add(house);
        FuncWriteAndRead.writeHouse(houseList, true);
    }


    public void showListHouse() {
        List<House> list = new ArrayList<>();
        list = FuncWriteAndRead.readHouse();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).showInfo();
        }
    }

    public void addRoom() {
        List<Room> roomList = new ArrayList<>();
        String id;
        String nameService;
        double area;
        double cost;
        int amountOfPeople;
        System.out.print("Enter Id: ");
        id = scanner.nextLine();
        System.out.print("Enter name of service: ");
        nameService = scanner.nextLine();
        System.out.print("Enter area can use: ");
        area = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter cost: ");
        cost = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter amount of people: ");
        amountOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter type rent: ");
        String typeRent = scanner.nextLine();
        System.out.print("Enter freeService: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id, nameService, area, cost, amountOfPeople, typeRent, freeService);
        roomList.add(room);
        FuncWriteAndRead.writeRoom(roomList, true);
    }

    public void showListRoom() {
        List<Room> list = new ArrayList<>();
        list = FuncWriteAndRead.readRoom();
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).showInfo();
        }
    }


}
