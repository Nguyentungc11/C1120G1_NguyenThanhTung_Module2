package case_study.commons;

import case_study.models.Customer;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteAndRead {
    static final String PATH_VILLA = "src/case_study/data/Villa.csv";
    static final String PATH_HOUSE = "src/case_study/data/House.csv";
    static final String PATH_ROOM = "src/case_study/data/Room.csv";
    static final String PATH_CUSTOMER = "src/case_study/data/Customer.csv";
    static File file = new File(PATH_VILLA);
    static File file1 = new File(PATH_HOUSE);
    static File file2 = new File(PATH_ROOM);
    static File fileCustomer = new File(PATH_CUSTOMER);

    public static void writeVilla(List<Villa> villaList,boolean option) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa1 : villaList) {
                bufferedWriter.write(villa1.getInfo());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file.");
            e.printStackTrace();
        }

    }

    public static List<Villa> readVilla() {
        List<Villa> villaList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array = null;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], array[7], Double.parseDouble(array[8]), Integer.parseInt(array[9]));
                villaList.add(villa);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không hiển thị file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
            e.printStackTrace();
        }
        return villaList;
    }

    public static void writeHouse(List<House> houseList,boolean option) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file1,option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House house1 : houseList) {
                bufferedWriter.write(house1.getInfo());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file.");
            e.printStackTrace();
        }

    }

    public static List<House> readHouse() {
        List<House> houseList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file1);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array = null;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                House house = new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], array[7], Integer.parseInt(array[8]));
                houseList.add(house);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không hiển thị file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
            e.printStackTrace();
        }
        return houseList;
    }

    public static void writeRoom(List<Room> roomList, boolean option) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file2,option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room1 : roomList) {
                bufferedWriter.write(room1.getInfo());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file.");
            e.printStackTrace();
        }

    }

    public static List<Room> readRoom() {
        List<Room> roomList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file2);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array = null;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                Room room = new Room(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6]);
                roomList.add(room);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không hiển thị file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
            e.printStackTrace();
        }
        return roomList;
    }
    public static void writeCustomer(List<Customer> customersList, boolean option) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileCustomer,option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer1 : customersList) {
                bufferedWriter.write(customer1.getInfo());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }


        } catch (IOException e) {
            System.out.println("Lỗi ghi file.");
            e.printStackTrace();
        }

    }
    public static List<Customer> readCustomer() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileCustomer);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array = null;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
                Customer customer = new Customer(array[0], array[1],array[2], array[3],
                        array[4], array[5], array[6], array[7],array[8]);
                customerList.add(customer);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không hiển thị file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
            e.printStackTrace();
        }
        return customerList;
    }

}
