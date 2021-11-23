package com.pb.kovtuh.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {
    //- method createNumbersFile "numbers.txt"
    public static void createNumbersFile(){
        int minr=0;
        int maxr=100;
        Path path = Paths.get("O:\\Study 2021 PB\\src\\com\\pb\\kovtuh\\hw9\\numbers.txt");

        try (FileWriter numbers = new FileWriter(String.valueOf(path))) {
            for (int st = 0; st < 10; ++st)
            {
                for (int col = 0; col < 10; col++) {
                    int x = minr + (int) (Math.random() * ((maxr - minr) + 1));
                    numbers.write(+x+" ");
                                    }
                numbers.write("\n");
            }
        }catch (Exception ex) {
                System.out.println("Error with file write: " + ex);
            }
        }

    //- method createOddNumbersFile
    public static void createOddNumbersFile(){
        Path oddpath = Paths.get("O:\\Study 2021 PB\\src\\com\\pb\\kovtuh\\hw9\\odd-numbers.txt");
        Path path = Paths.get("O:\\Study 2021 PB\\src\\com\\pb\\kovtuh\\hw9\\numbers.txt");
        try (FileWriter oddnumbers = new FileWriter(String.valueOf(oddpath)); BufferedReader numbers = Files.newBufferedReader(path)) {
            String line;
            while((line = numbers.readLine()) != null) {
                System.out.println(line);
                String[] row=line.split("\\s+");
                for (int col = 0; col < 10; col++) {
                    if (Integer.valueOf(row[col]) % 2 ==0){
                        oddnumbers.write("0 ");
                    }
                    else {
                        oddnumbers.write(row[col] + " ");
                    }
                }
                oddnumbers.write("\n");
            }
        }catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
    }

    public static void main(String[] args) {
        System.out.println("Начало программы, создание файла numbers.txt");
        createNumbersFile();
        System.out.println("Создан файл numbers.txt \nЧтение из файл numbers.txt и создание файл odd-numbers.txt");
        createOddNumbersFile();
        System.out.println("Файлы numbers.txt и odd-numbers.txt успешно созданы.\nКонец программы");
    }
}
