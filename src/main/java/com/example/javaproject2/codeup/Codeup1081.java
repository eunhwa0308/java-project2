package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int j = 1; j <= num1; j++) {
            for (int i = 1; i <= num2; i++) {
                System.out.printf("%d %d\n",j,i);
            }
        }


    }
}
