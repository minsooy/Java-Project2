package com.likelion.javaproject2.week1;

import com.likelion.javaproject2.PrintHello;

import java.util.Scanner;

public class VarDeclare {
    public static void main(String[] args) {
        int val1 = 0;
        val1 = 100;
        PrintHello printHello;
        printHello = new PrintHello();

        System.out.println(val1);
        printHello.print();
    }
}
