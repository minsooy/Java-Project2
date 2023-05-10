package com.likelion.javaproject2.week4.day3.InterfacePractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter{

    private Printer printer = new ConsolePrinter();
    public String makeLine(int height, int line){
        return String.format("%s\n","*".repeat(line));
    }

//    public void printToFile(String[] lines) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("./triangle.txt"));
//        for (int i = 0; i < lines.length; i++) {
//            bw.append(lines[i]);
//            bw.flush();
//        }
//        bw.close();
//    }

//    public void printToConsole(String[] lines) {
//        for (int i = 0; i < lines.length; i++) {
//            System.out.print(lines[i]);
//        }
//    }

    // 모양 출력하기
    public void printShape(int h) throws IOException {
        // 모양 만들기
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeLine(h, i + 1);
        }

        // 모양 출력하기
        printer.print(lines);
    }


    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter();
        rtp.printShape(5);
    }

}
