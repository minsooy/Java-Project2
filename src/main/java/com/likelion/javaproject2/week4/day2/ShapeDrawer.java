package com.likelion.javaproject2.week4.day2;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class ShapeDrawer {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public void printToFile(int height, String directory) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(directory);
        for (int i = 0; i < height; i++) {
            writer.print(makeALine(height, i));
        }
        writer.close();
    }


    public abstract String makeALine(int h, int i);

}