package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class PyramidGenerator {

    public void pyramid(int idx) {
        for (int i = 0; i < idx; i++) {
            for (int j = 1; j < idx - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public void reversePyramid(int idx){
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = idx * 2 - 2 * i; j > 0 +1; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
