package com.likelion.javaproject2.week4.day2;


import java.util.Scanner;

class PyramidGeneratorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        PyramidGenerator py = new PyramidGenerator();
        py.pyramid(idx);
        py.reversePyramid(idx);

    }

}