package com.likelion.javaproject2.week4.day2;

import java.util.Scanner;

public class PyramidGenerator {

    public void pyramid(int idx) {
        for (int i = 0; i < idx; i++) {
            for (int j = 1; j < idx - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public void reversePyramid(int idx){
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = idx * 2 - 2 * i; j > 0 +1; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    /**
     * 여러가지 형태의 줄을 만들 수 있는 매소드 생성
     * @param idx 만들려는 모양의 총 줄 길이
     * @param num 만들려는 줄의 번호
     * @param type 만들려는 모양의 타입. 피라미드면 'n' 리버스 피라미드는 'r' 평행사변형은 'p'로 한다.
     */

    public void oneLine(int idx , int num, String type){
        switch (type){
            case("n") -> System.out.println(String.format("%s%s", " ".repeat(idx - 1 - num), "*".repeat(num * 2 + 1)));
            case("r") -> System.out.println(String.format("%s%s", " ".repeat(num), "*".repeat(2 * (idx - num) - 1)));
            case("p") -> System.out.println(String.format("%s%s", " ". repeat(idx - 1 - num),"*".repeat(idx)));
            default -> throw new IllegalStateException("n r p 중 하나를 입력하셔야 합니다!!! 현재 입력값: " + type);
        }
    }


//    public void reverseLine(int idx, int num){
//        System.out.println(String.format("%s%s", " ".repeat(num), "*".repeat(2 * (idx - num) - 1)));
//    }
}
