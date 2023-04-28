package com.likelion.javaproject2.week2.day5;

public class Promotion {
    public static void main(String[] args) {
        int projNum = 8;
        int years = 4;

        if (years > 5 || projNum > 10){
            System.out.println("승진 대상입니다!");
        } else {
            System.out.println("승진 대상이 아닙니다.");
        }
    }
}
