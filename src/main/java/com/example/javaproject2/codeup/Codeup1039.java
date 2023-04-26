package com.example.javaproject2.codeup;

import java.util.Scanner;

//정수 2개 입력받아 합 출력하기 범위:  -2147483648 ~ +2147483648
public class Codeup1039 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        System.out.println(num1+num2);
    }
}
