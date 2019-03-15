package com.ansou.euler;

public class Ex02 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex02().run());
    }

    @Override
    public String run() {
        int first = 1;
        int second = 2;
        int sum = 0;
        int tmp = 0;
        for (int i = 1; second < 4000000; i++) {
            if (second % 2 == 0)
                sum = sum + second;
            tmp = second;
            second = tmp + first;
            first = tmp;
        }
        return String.valueOf(sum);
    }
}
