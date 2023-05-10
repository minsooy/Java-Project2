package com.likelion.javaproject2.week4.day3.InterfacePractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter2 implements Printer2{
    @Override
    public void print(String lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        bw.append(lines);
        bw.flush();
        bw.close();
    }
}
