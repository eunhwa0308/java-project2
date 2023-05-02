package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class Collatz {


    public static int solution(int num){
        int answer = 0;
        int input = num;
        if(input == 1){
            return 0;
        }

        while(input != 1 || answer < 500){

            if(input % 2 == 0){
                input = input / 2;
            }else {
                input = input * 3 + 1;
            }
            answer++;

        }
        if(input != 1){return -1;}
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println( solution(num));

    }
}
