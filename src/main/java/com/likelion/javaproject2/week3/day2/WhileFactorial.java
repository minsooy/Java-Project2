package com.likelion.javaproject2.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        int num = 1;
        int answer = 1;
        while(num < 10){
            System.out.println(answer);
            answer *= num;
            num++;
        }
    }
}
