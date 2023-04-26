package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class ThreeByThree {
    public static void main(String[] args) {
        int[][] chart33 = new int[3][3];
        chart33[0][0] = 1;
        chart33[0][1] = 2;
        chart33[0][2] = 3;
        chart33[1][0] = 4;
        chart33[1][1] = 5;
        chart33[1][2] = 6;
        chart33[2][0] = 7;
        chart33[2][1] = 8;
        chart33[2][2] = 9;

        System.out.println(Arrays.toString(chart33[0]));
        System.out.println(Arrays.toString(chart33[1]));
        System.out.println(Arrays.toString(chart33[2]));

    }
}
