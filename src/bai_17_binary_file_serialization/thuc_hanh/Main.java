package bai_17_binary_file_serialization.thuc_hanh;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.
                copy(source.toPath(),dest.toPath());
    }
}
