package com.likelion.javaproject2.week1;

public class PrintfEx {
    public static void main(String[] args) {
        System.out.printf("%s\n", "Hello");
        System.out.printf("%s * %s = %s\n", 1,1,1);
        PrintfEx.dateEx();
        System.out.printf("%s * %s = %s\n", 2,1,2*1);
        System.out.printf("%s * %s = %s\n", 2,2,2*2);
        System.out.printf("%s * %s = %s\n", 2,3,2*3);
        System.out.printf("%s * %s = %s\n", 2,4,2*4);
        System.out.printf("%s * %s = %s\n", 2,5,2*5);
        System.out.printf("%s * %s = %s\n", 2,6,2*6);
        System.out.printf("%s * %s = %s\n", 2,7,2*7);
        System.out.printf("%s * %s = %s\n", 2,8,2*8);
        System.out.printf("%s * %s = %s\n", 2,9,2*9);

    }

    public static void dateEx(){
        System.out.printf("%d-%02d-%02d",2023,04,20);
    }
}
