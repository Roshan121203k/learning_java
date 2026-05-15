package com.training.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionHandling {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt"); // file name
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}