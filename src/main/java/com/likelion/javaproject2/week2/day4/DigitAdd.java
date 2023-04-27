package com.likelion.javaproject2.week2.day4;

public class DigitAdd {
    public static void main(String[] args) {
        int num =687;
        int sum = 0;

        sum += num %10;
        num /= 10;
        System.out.println("ones :" + sum);

        sum += num %10;
        num /= 10;
        System.out.println("tens and ones :" + sum);


        sum += num;
        System.out.println("all digits :" + sum);
    }
}
