package com.likelion.javaproject2.week4.day2;


import java.util.Scanner;

class PyramidGeneratorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        int idx = sc.nextInt();

        PyramidGenerator py = new PyramidGenerator();
//        py.pyramid(idx);
//        py.reversePyramid(idx);

        for (int i = 0; i < idx; i++) {
            py.oneLine(idx, i , type);
        }

//        for (int i = 0; i < idx; i++) {
//            py.reverseLine(idx, i);
//        }

    }

}