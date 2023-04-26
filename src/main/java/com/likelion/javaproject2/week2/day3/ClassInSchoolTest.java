package com.likelion.javaproject2.week2.day3;

import com.likelion.javaproject2.week2.day2.ReferenceTypeArr;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no =1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "선생님";
        classInSchool.teacher.address = "선생님의 주소";
        classInSchool.students = new ReferenceTypeArr.Student[30];
    }

}
