package com.example.javaproject2.codeup;

import java.util.Scanner;

//정수 3개 입력받아 짝수만 출력하기
public class Codeup1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        for (int i = 0 ; i < 3 ; i++){
            if(arr[i] % 2 == 0 ){
                System.out.println(arr[i]);
            }
        }
    }
}
