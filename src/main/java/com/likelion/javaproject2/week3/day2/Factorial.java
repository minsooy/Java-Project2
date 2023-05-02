package com.likelion.javaproject2.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int answer = 1;

        for (int i = 1; i <= 5; i++) {
            answer *= i;
        }

        System.out.println(answer);
    }
}
