package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        do{
            int num = sc.nextInt();
            System.out.println(num);
            count ++;
        }while(count > 0);
    }
}
