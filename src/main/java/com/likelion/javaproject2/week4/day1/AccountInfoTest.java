package com.likelion.javaproject2.week4.day1;


class AccountInfoTest {
    public static void main(String[] args) {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.balance = 3000;
        if(accountInfo.isSufficient()){
            System.out.println("충분합니다");
        }else{
            System.out.println("부족합니다");
        }
    }

}