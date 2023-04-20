package com.likelion.javaproject2.week1;

public class PrintfEx {
    public static void main(String[] args) {
        System.out.printf("%s\n", "Hello");
        System.out.printf("%s * %s = %s\n", 1,1,1);
        PrintfEx.dateEx();
        System.out.printf("%s * %s = %s\n", 2,1,2);
        System.out.printf("%s * %s = %s\n", 2,2,4);
        System.out.printf("%s * %s = %s\n", 2,3,6);
        System.out.printf("%s * %s = %s\n", 2,4,8);
        System.out.printf("%s * %s = %s\n", 2,5,10);
        System.out.printf("%s * %s = %s\n", 2,6,12);
        System.out.printf("%s * %s = %s\n", 2,7,14);
        System.out.printf("%s * %s = %s\n", 2,8,16);
        System.out.printf("%s * %s = %s\n", 2,9,18);

    }

    public static void dateEx(){
        System.out.printf("%d-%02d-%02d",2023,04,20);
    }
}
