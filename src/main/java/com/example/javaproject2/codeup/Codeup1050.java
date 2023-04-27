package com.example.javaproject2.codeup;

import java.util.Scanner;
//두 정수 입력받아 비교하기
public class Codeup1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = (num1 == num2) ? 1 : 0;
        System.out.println(result);

    }
}
