package com.example.javaproject2.codeup;

import java.util.Scanner;
//삼각형의 넓이 구하기
public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%.1f",(float)num1*num2/2);
    }
}
