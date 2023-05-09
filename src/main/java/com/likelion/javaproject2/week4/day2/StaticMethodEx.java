package com.likelion.javaproject2.week4.day2;

import java.util.Arrays;

public class StaticMethodEx {
    public static void printArray(int[][] matrix){
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println("--------------------");
    }

    public static void multiplicationTable(int num){
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("%d x %d = %d\n" , num , i, num * i);
        }
    }

    public static void main(String[] args) {
        multiplicationTable(2);

        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printArray(matrix);
        matrix[0][0] = 0;
        matrix[1][1] = 0;
        matrix[2][2] = 0;
        printArray(matrix);
        matrix[0][2] = 0;
        matrix[1][1] = 0;
        matrix[0][2] = 0;
        printArray(matrix);
    }
}
