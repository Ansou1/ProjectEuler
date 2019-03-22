package com.ansou.euler;

public class Ex09 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex09().run());
    }

    @Override
    public String run() {
        for (int a = 0; a <= 1000; a++) {
            for (int b = a + 1; b <= 1000 - a; b++) {
                int c = 1000 - a - b;
                if (c > b && c * c == a * a + b * b) {
                    return String.valueOf(a*b*c);
                }
            }
        }
        return null;
    }
}
