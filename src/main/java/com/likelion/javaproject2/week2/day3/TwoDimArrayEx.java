package com.likelion.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrayEx {
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-----------------------");


    }

    public static void main(String[] args) {
        int[][] arr2 = new int[3][3];

        printArray(arr2);

        arr2[0][0] = 1;
        arr2[1][1] = 2;
        arr2[2][2] = 3;

        printArray(arr2);

    }
}
