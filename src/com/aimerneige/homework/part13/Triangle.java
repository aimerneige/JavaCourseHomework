package com.aimerneige.homework.part13;

public class Triangle {
    double sideA, sideB, sideC, area;
    boolean isTriangle;
    public String getArea() {
        if (isTriangle) {
            double p = (sideA + sideB + sideC) / 2.0;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return String.valueOf(area);
        } else {
            return "无法计算面积";
        }
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
        isTriangleCheck();
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        isTriangleCheck();
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
        isTriangleCheck();
    }

    private void isTriangleCheck() {
        isTriangle = sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA;
    }
}
