package com.likelion.javaproject2.week4;



public class UserFactory {
    public CreateUser getAdultUser(){
        CreateUser user = new CreateUser();
        user.age = 34;
        return user;
    }

}
