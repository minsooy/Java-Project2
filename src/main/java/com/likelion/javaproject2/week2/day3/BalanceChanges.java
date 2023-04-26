package com.likelion.javaproject2.week2.day3;

public class BalanceChanges {
    public static void main(String[] args) {

        int balance = 1_000_000;
        System.out.println("balance = " + balance);

        balance = balance - 500_000;
        System.out.println("balance = " + balance);

        balance = balance + 300_000;
        System.out.println("balance = " + balance);
    }
}
