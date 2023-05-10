package com.likelion.javaproject2.week4.day2;


import com.likelion.javaproject2.week4.day3.InterfacePractice.ConsolePrinter;
import com.likelion.javaproject2.week4.day3.InterfacePractice.ConsolePrinter2;

import java.io.IOException;

public class ShapeDrawerTest {
    public static void main(String[] args) throws IOException {
        ShapeDrawer sd = new PyramidShapeDrawer(new ConsolePrinter2());
        sd.printShape(4);

        System.out.println("------------");

        sd = new ParallelogramShapeDrawer(new ConsolePrinter2());
        sd.printShape(4);
    }
}