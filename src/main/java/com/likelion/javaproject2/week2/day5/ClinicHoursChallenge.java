package com.likelion.javaproject2.week2.day5;

public class ClinicHoursChallenge {
    public static void main(String[] args) {
        String day = "월";
        String time = "";

        switch (day){
            case "월", "화", "수", "목", "금": time = "09:30-20:00"; break;
            case "토": time = "09:30-17:00"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);

    }
}
