package case_study.commons;

import case_study.models.Booking;
import case_study.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadBooking {
    static final String PATH_BOOKING = "src/case_study/data/Booking.csv";
    static File file = new File(PATH_BOOKING);
    public static void writeBooking(List<Booking> bookingList, boolean option) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking booking : bookingList) {
                bufferedWriter.write(booking.getInfo());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file.");
            e.printStackTrace();
        }

    }
    public static List<Booking> readBooking() {
        List<Booking> bookingList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            String[] array = null;
            while ((str = bufferedReader.readLine()) != null) {
                array = str.split(",");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không hiển thị file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file.");
            e.printStackTrace();
        }
        return bookingList;
    }


}
