package com.likelion.javaproject2.week4.day2;


import com.likelion.javaproject2.week4.day3.InterfacePractice.Printer;
import com.likelion.javaproject2.week4.day3.InterfacePractice.Printer2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class ShapeDrawer {
    Printer2 printer;
    public ShapeDrawer(Printer2 printer) {
        this.printer = printer;
    }

    public void printShape(int height) throws IOException {
        for (int i = 0; i < height; i++) {
            printer.print(makeALine(height, i));
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