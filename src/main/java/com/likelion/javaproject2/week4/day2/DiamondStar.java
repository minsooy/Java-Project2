package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = sc.nextInt();
        int height = idx * 2 - 1;

        for (int i = 1; i <= height; i++) {
            if (i <= idx){
                System.out.println(String.format("%s%s", " ".repeat(idx - i), "*".repeat((i - 1) * 2 + 1)));
            } else {
                System.out.println(String.format("%s%s", " ".repeat(i - idx), "*".repeat((height - i) * 2 + 1 )));
            }
        }
    }
}
