package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long iVal1 = sc.nextInt();
        long iVal2 = sc.nextInt();
        long iVal3 = sc.nextInt();

        long sum = iVal1+iVal2+iVal3;
        double avg =sum/3f;

        System.out.println(sum);
        System.out.printf("%.1f",avg);
    }
}
