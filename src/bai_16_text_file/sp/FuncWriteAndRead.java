package bai_16_text_file.sp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FuncWriteAndRead {
    public static void writeProduct(Product a){
        File file = new File("src/bai_16_text_file/sp/Product.csv");
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter=new FileWriter(file,true);
            bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(a.getId()+","+a.getName()+","+a.getPrice());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("loi ghi file");
            e.printStackTrace();
        }
    }
    public static List<Product> readProduct(){
        List<Product> list = new ArrayList<>();
        File file = new File("src/bai_16_text_file/sp/Product.csv");
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String str ="";
            String[] arr =null;
            while ((str=bufferedReader.readLine())!=null){
                arr=str.split(",");
                Product product = new Product(arr[0],arr[1],Integer.parseInt(arr[2]));
                list.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
