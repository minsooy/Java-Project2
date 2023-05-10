package com.likelion.javaproject2.week4.day3.InterfacePractice;

import java.io.IOException;

public class LinePrint implements Printer2{

    @Override
    public void print(String lines) {
        System.out.println(lines);
    }
}
