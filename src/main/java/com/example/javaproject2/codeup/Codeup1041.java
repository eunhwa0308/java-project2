package com.example.javaproject2.codeup;

import java.util.Scanner;
//문자 1개 입력받아 다음 문자 출력하기
public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = (int)sc.next().charAt(0)+1;
        char ch = (char) input;
        System.out.println(ch);


    }
}
