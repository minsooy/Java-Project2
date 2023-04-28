package com.likelion.javaproject2.week2.day5;

public class IfElse {
    public static void main(String[] args) {
        int balance = 2_000_000;

        if (balance > 1_000_000){
            System.out.println("돈이 충분합니다");
        }
        else{
            System.out.println("일을 해야합니다!");
        }
    }
}
