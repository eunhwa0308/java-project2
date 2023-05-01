package com.example.javaproject2.week2.day5;

public class SwitchCaseBreak {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        switch (dayOfWeek){
            case 1:
                System.out.println("월요일");
            case 2:
                System.out.println("화요일");
            default:
                System.out.println(dayOfWeek+"에 해당하는 요일은 없습니다.");
        }
    }
}
