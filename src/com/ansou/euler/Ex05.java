package com.ansou.euler;

public class Ex05 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex05().run());
    }

    @Override
    public String run() {
        for (int i = 1; i < 1000000000; i++) {
            int j = 1;
            boolean quit = true;
            while (j <= 20 && (quit)) {
                if (i % j != 0) {
                    quit = false;
                }
                if (j == 20) {
                    return String.valueOf(i);
                }
                j++;
            }
        }
        return null;
    }
}
