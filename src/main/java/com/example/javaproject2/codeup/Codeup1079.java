package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        for (int i = 0;  ; i++) {
            if(input[i].equals("q")){
                System.out.println(input[i]);
                break;
            }
            System.out.println(input[i]);
        }

    }
}
