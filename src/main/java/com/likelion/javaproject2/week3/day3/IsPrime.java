package com.likelion.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0){
                System.out.println("소수가 아닙니다");
                break;
            }
        }

    }

    /**
     * 소수를 찾는 방법 중 for의 조건에 i * i <= num 부분보다 비효율적인 경계들이 있다
     * 예를들면 i < num , i * 2 <= num 이 있다.
     */
}
