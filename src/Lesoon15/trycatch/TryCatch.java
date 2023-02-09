package Lesoon15.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        File file1 = new File("путь к файлу");

        try {
            Scanner scanner = new Scanner(file1);
            System.out.println("после сканера");
        } catch (FileNotFoundException d) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try-catch программа работает дальше");


        }

    }