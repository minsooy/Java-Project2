package com.likelion.javaproject2.week3;

public class MultipleTimesTable {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {
            System.out.println("=====" + i + "단=====");
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
