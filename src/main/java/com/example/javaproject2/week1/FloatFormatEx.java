package com.example.javaproject2.week1;

import java.util.Scanner;

public class FloatFormatEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("%f\n",0.5);
        System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
    }
}
