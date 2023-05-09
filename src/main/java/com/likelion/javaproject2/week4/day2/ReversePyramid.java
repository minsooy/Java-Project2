package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();

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
