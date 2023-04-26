package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrayEx {
    public static void main(String[] args) {
        int[][] arr2 = new int[3][3];

        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));

        System.out.println("-----------------------");

        arr2[0][0] = 1;
        arr2[1][1] = 2;
        arr2[2][2] = 3;

        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));
    }
}
