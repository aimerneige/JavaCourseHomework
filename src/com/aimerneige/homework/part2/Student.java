package com.aimerneige.homework.part2;

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void computeCircleArea(Circle circle) {
        System.out.println(name +
            "计算半径为：" + circle.getRadius() +
            "的圆形的面积为：" + circle.getArea() +"。");
    }

    public void computeLaderArea(Lader lader) {
        System.out.println(name +
            "计算上底为：" + lader.getAbove() +
            "，下底为：" + lader.getBottom() +
            "，高为：" + lader.getHeight() +
            "的梯形的面积为：" + lader.getArea() + "。");
    }

    public void computeRectArea(Rect rect) {
        System.out.println(name +
            "计算长为：" + rect.getHeight() +
            "，宽为：" + rect.getWidth() +
            "的矩形的面积为：" + rect.getArea() + "。");
    }
}
