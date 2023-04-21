package com.likelion.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User yms = new User();
        yms.name = "Yeo Min Soo";
        yms.phoneNo = "010-0000-0000";
        yms.age = 26;
        System.out.printf("%s는 성인입니까? : %s",yms.name,yms.isAdult());
    }
}
