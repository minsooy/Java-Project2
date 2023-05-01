package com.likelion.javaproject2.week3;

public class CharForLoop {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.printf("%s ", i);

        }
        System.out.printf("\n");

        for (char i = 'z'; i >= 'a' ; i--) {
            System.out.printf("%s ", i);

        }
        System.out.printf("\n");

        for(int c = 65 ; c <= 'Z' ; c++){
            System.out.printf("%d:%c ", c,c);
        }
        System.out.printf("\n");

        for(int c = 'A' ; c <= 'Z'; c++ ){
            System.out.printf("%d ",c);
        }

    }
}
