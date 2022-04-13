import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/inputHW02.txt");
        Scanner scanner = new Scanner(filePath);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
            System.out.println(integers);
        }
    }
}
