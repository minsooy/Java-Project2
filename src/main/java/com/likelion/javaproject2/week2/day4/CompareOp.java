package com.likelion.javaproject2.week2.day4;

public class CompareOp {
    public static void main(String[] args) {
        int val1 = 20;
        int val2 = 20;
        boolean result = val1 == val2;

        System.out.println(result);

        System.out.printf("%d == %d --> %b\n", val1, val2, val1 == val2);
        System.out.printf("%d != %d --> %b\n", val1, val2, val1 != val2);
        System.out.printf("%d < %d --> %b\n", val1, val2, val1 < val2);
        System.out.printf("%d <= %d --> %b\n", val1, val2, val1 <= val2);
        System.out.printf("%d > %d --> %b\n", val1, val2, val1 > val2);
        System.out.printf("%d >= %d --> %b\n", val1, val2, val1 >= val2);

    }
}
