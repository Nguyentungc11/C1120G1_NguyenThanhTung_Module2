package bai_16_text_file.quan_li_san_pham.common;

import bai_16_text_file.quan_li_san_pham.model.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FunWriteAndRead {
    public static void writeProduct(Product product){
        File file = new File("src/bai_16_text_file/quan_li_san_pham/data/Product.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(product.getInfo() + ", "+ product.getName() + ", " + product.getPrice());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
