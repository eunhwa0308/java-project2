package com.example.javaproject2.week2.day4;

public class Accumulate687While {
    public static void main(String[] args) {

        int num = 687;
        // 누적할 변수 선언
        int answer = 0;

        while(num > 0){
            answer = answer + num % 10;
            System.out.printf("answer:%d\n", answer);
            num = num / 10;
        }


    }
}
