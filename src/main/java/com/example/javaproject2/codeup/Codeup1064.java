package com.example.javaproject2.codeup;

import java.util.Scanner;
//정수 3개 입력받아 가장 작은 수 출력하기
public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        System.out.println(  (val1 < val2  ? val1 : val2) < val3 ? (val1 < val2  ? val1 : val2) : val3 );

    }
}
