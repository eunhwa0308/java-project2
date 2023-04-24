package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result[] = input.split("\\.");
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
