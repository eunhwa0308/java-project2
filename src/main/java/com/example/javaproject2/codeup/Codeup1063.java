package com.example.javaproject2.codeup;

import java.util.Scanner;
//두 정수 입력받아 큰 수 출력하기
public class Codeup1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(  val1 > val2 ? val1 : val2 );

    }

}
