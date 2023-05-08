package com.likelion.javaproject2.week4;

class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        CreateUser user = userFactory.getAdultUser();
        System.out.println(user.age);
    }
}