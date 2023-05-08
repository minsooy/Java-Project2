package com.likelion.javaproject2.week4;

import com.likelion.javaproject2.week1.day5.User;

public class VariousReturnType {
    public boolean isAdult(){
        return true;
    }
    public int plus(){
        return 1 + 1;
    }
    public User getUser(){
        return new User();
    }
    public void printHello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        boolean isAdult = vrt.isAdult();
        int plusResult = vrt.plus();
        User user = vrt.getUser();
        vrt.printHello();
    }
}
