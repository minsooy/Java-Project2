package com.likelion.javaproject2.week4.day2;


import com.likelion.javaproject2.week4.day3.InterfacePractice.Printer;
import com.likelion.javaproject2.week4.day3.InterfacePractice.Printer2;

public class ParallelogramShapeDrawer extends ShapeDrawer{
    public ParallelogramShapeDrawer(Printer2 printer) {
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - 1 - i), "*".repeat(h));
    }
}