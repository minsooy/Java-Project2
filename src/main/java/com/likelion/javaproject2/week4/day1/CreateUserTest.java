package com.likelion.javaproject2.week4.day1;

class CreateUserTest {
    public static void main(String[] args) {
        CreateUser user1 = new CreateUser();
        user1.name = "김미미";
        user1.phone = "010-1234-5678";
        user1.age = 17;

        System.out.println(user1.isAdult());

    }

}