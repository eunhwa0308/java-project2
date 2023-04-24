package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User eunhwa = new User();
        eunhwa.name = "신은화";
        eunhwa.phoneNumber = "010-0000-1234";
        eunhwa.age = 23;

        User jaesung = new User();
        jaesung.name = "재성 매니저";
        jaesung.phoneNumber = "010-0000-0000";
        jaesung.age = 24;

        System.out.printf("%s님은 성인입니까? %s\n",eunhwa.name,eunhwa.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n",jaesung.name,jaesung.isAdult());


    }
}
