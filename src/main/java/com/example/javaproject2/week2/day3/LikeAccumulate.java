package com.example.javaproject2.week2.day3;

//변수에 값 누적하기
public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        likeCount = likeCount + 1;
        System.out.println(likeCount); // 좋아요를 한 개만 받은 경우
        likeCount = likeCount + 1; // 좋아요를 한 개 더 받은 경우
        System.out.println(likeCount);
        likeCount = likeCount - 1; // 좋아요를 취소한 경우
        System.out.println(likeCount);
    }

}
