package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int height = 2* idx - 1;

        for (int i = 1; i < height + 1; i++) {
            for (int j = 0; j < i  ; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
