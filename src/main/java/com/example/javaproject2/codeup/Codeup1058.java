package com.example.javaproject2.codeup;

import java.util.Scanner;
//둘 다 거짓일 경우만 참 출력하기
public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d\n", val1 == 0 && val2 == 0  ? 1 : 0);
    }
}
