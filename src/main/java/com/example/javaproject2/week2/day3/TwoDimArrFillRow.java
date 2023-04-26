package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {

    //행 번호를 넣으면 그 행을 1로 값을 넣어주는 static method
    public static void fillRow(int[][] arr,int n){System.out.println(arr.length);

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;
        arr[2][4] = 1;
        printTwoDimArr(arr);
    }

    public static void printTwoDimArr(int[][] arr){
        System.out.println(Arrays.toString(arr[0])); // 행 단위로 출력
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillRow(arr,1);




        System.out.println(arr.length);


    }

}
