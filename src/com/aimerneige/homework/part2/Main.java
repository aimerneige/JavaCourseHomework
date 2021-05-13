package com.aimerneige.homework.part2;

public class Main {
    public static void main(String[] args) {
        Student student_zhang = new Student("张三");
        Student student_li = new Student("李四");
        Student student_wang = new Student("王五");
        Circle circle = new Circle(10);
        Lader lader = new Lader(6, 7, 8);
        Rect rect = new Rect(4, 5);
        student_zhang.computeCircleArea(circle);
        student_zhang.computeLaderArea(lader);
        student_zhang.computeRectArea(rect);
        student_li.computeCircleArea(circle);
        student_li.computeLaderArea(lader);
        student_li.computeRectArea(rect);
        student_wang.computeCircleArea(circle);
        student_wang.computeLaderArea(lader);
        student_wang.computeRectArea(rect);
    }
}
