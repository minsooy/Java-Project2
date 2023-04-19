package com.likelion.javaproject2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedSum{

    public void addTwo() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(is);

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num1 + num2 = " + (num1+num2));
    }

/**
 * 아래의 코드는 read를 사용했기때문에 한 글자씩 읽어버렸다.
 * 그렇기 때문에 100 과 200을 더하는 예시를 사용할 경우 1 과 0 처음 두 글자의 아스키 코드를 읽어 더하는것이다.
 * 때문에 위 코드의 파싱을 사용하여 타입을 정수로 변환하여야 올바른 합이 나온다.
 */

//    public void plusTwoNumbers() throws IOException {
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(is); // 카트 가지고 오기
//        System.out.println(br.read() + br.read());
//    }

}
