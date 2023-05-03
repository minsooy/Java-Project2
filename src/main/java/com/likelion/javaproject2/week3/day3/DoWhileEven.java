package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class DoWhileEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =0;

        do{
            num = sc.nextInt();
            System.out.println("짝수를 입력해주세요 :" + num);

        }while(num % 2 != 0);

    }
}
