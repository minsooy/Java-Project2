package com.likelion.javaproject2.week4.day3;

import com.likelion.javaproject2.week4.day2.ShapeDrawer;
import com.likelion.javaproject2.week4.day3.InterfacePractice.Printer;
import com.likelion.javaproject2.week4.day3.InterfacePractice.Printer2;

public class DiamondShapeDrawer extends ShapeDrawer {
    public DiamondShapeDrawer(Printer2 printer){
        super(printer);
    }

    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        if(i <= pivot){
            return String.format("%s%s\n", " ".repeat( pivot - i),"*".repeat (2 * i + 1));
        } else {
            return String.format("%s%s\n", " ".repeat(i - pivot), "*".repeat( 2 * (h - i) - 1));
        }
    }
}
