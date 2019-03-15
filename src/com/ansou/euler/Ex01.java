package com.ansou.euler;

public class Ex01 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex01().run());
    }

    @Override
    public String run() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 5 == 0) || (i % 3 == 0)) {
                sum = sum + i;
            }
        }
        return String.valueOf(sum);
    }
}
