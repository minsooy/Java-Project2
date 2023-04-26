package com.likelion.javaproject2.week2.day3;

public class DigitAddition {
    public static void main(String[] args) {
        int num =687;
        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        int hunds = num / 10;

        System.out.println(ones + tens + hunds);

    }
}
