package com.likelion.javaproject2.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds/60;
        int leftover = seconds % 60;
        System.out.printf("%d초는 %d분 %d초 입니다." , seconds, minute, leftover);

    }
}
