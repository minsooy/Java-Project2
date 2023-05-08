package com.likelion.javaproject2.week3.day3;

public class OddSum {
    public static void main(String[] args) {
        int num = 10;
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            if(i % 2 !=0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
