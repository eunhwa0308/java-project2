package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInShool classInShool = new ClassInShool();
        classInShool.no = 1;
        classInShool.teacher = new Teacher();
        classInShool.teacher.name = "김미미";
        classInShool.teacher.age = 33;
        classInShool.teacher.address = "경기도 광주시 ";
        classInShool.students = new Student[30];

        System.out.println(classInShool.teacher.name);
        System.out.printf("%d반 담임 선생님 성함은 %s입니다.",classInShool.no,classInShool.teacher.name);

    }
}
