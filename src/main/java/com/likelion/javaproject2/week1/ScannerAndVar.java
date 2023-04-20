package com.likelion.javaproject2.week1;

import java.util.Scanner;

public class ScannerAndVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자나 문자를 두개 입력해 주세요 (문자는 아스키값으로 변환됩니다)");
        System.out.print("첫번쨰 입력: ");
        int val1= Integer.parseInt(sc.next());
        System.out.print("두번쨰 입력: ");
        int val2= Integer.parseInt(sc.next());
        System.out.println("두값의 합은 : " +(val1 + val2) + "입니다!");


    }
}

