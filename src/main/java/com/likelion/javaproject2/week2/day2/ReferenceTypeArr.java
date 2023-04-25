package com.likelion.javaproject2.week2.day2;

public class ReferenceTypeArr {
    public class Student{
        String name;
        String phoneNo;
        int age;
    }

    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0].name = "Min Soo";
        students[0].phoneNo = "010-1234-5678";
        students[0].age = 26;
        students[1].name = "Gil dong";
        students[1].phoneNo = "010-8765-4321";
        students[1].age = 28;
    }
}
