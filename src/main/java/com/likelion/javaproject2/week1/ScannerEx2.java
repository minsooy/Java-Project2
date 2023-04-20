package com.likelion.javaproject2.week1;

import java.util.Scanner;

public class ScannerEx2 {
    public void ScanTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 두개 입력해주세요. 하나를 입력할때마다 엔터를 눌러주십시오");
        System.out.println("첫번쨰 숫자:");
        System.out.println("첫번째 숫자는 :" + sc.nextInt() +"입니다");
        System.out.println("두번쨰 숫자:");
        System.out.println("두번째 숫자는 :" + sc.nextInt() +"입니다");
    }
}
