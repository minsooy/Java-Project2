package com.likelion.javaproject2.week3;

import java.util.Scanner;

public class SelectTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("출력을 원하시는 단을 선택하십쇼: ");
        int choice = sc.nextInt();
        System.out.printf("%d단을 선택하셨습니다.\n", choice);

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n" ,choice ,i , choice * i);
        }
    }
}
