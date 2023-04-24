package com.likelion.javaproject2.week2;

public class DoubleParsing {
    public static void main(String[] args) {
        String var1 = "1.111111111";
        String var2 ="2.222222222";

        System.out.println(Float.parseFloat(var1)+Float.parseFloat(var2));
        System.out.println(Double.parseDouble(var1)+Double.parseDouble(var2));

    }
}
