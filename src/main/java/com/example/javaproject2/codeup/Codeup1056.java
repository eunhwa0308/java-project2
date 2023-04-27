package com.example.javaproject2.codeup;

import java.util.Scanner;
// 참/거짓이 서로 다를 때에만 참 출력하기(
public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.printf("%d\n", val1 != val2  ? 1 : 0);
    }
}
