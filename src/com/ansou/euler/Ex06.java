package com.ansou.euler;

public class Ex06 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex06().run());
    }

    @Override
    public String run() {
        int sumSquares = 0;
        int squareSum = 0;

        for (int i = 1; i <= 100; i++) {
            squareSum += i;
            sumSquares += Math.pow(i, 2);
        }
        return String.valueOf(Math.pow(squareSum, 2) - sumSquares);
    }
}
