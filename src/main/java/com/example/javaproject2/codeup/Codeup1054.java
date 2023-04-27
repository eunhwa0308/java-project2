package com.example.javaproject2.codeup;

import java.util.Scanner;
// 둘 다 참일 경우만 참 출력하기
public class Codeup1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d\n", sc.nextInt() == 1 && sc.nextInt() == 1 ? 1 : 0 );
    }
}
