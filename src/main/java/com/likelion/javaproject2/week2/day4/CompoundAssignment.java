package com.likelion.javaproject2.week2.day4;

public class CompoundAssignment {
    public static void main(String[] args) {
        int num = 10;

        num += 1;
        System.out.printf("num + 1 = %d\n",num);
        num -= 5;
        System.out.printf("num - 5 = %d\n",num);
        num *= 2;
        System.out.printf("num * 2 = %d\n",num);
        num /= 3;
        System.out.printf("num / 3 = %d\n",num);
        num %= 8;
        System.out.printf("num %% 8 = %d\n",num);
    }
}
