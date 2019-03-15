package com.ansou.euler;

public class Ex04 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex04().run());
    }

    public boolean isPalindrom(Integer number) {
        StringBuilder input1 = new StringBuilder();
        input1.append(number.toString());
        input1.reverse();
        return number.toString().equals(input1.toString());
    }

    @Override
    public String run() {
        for (int i = 999; i > 800; i--) {
            for (int j = 999; j > 800; j--) {
                if (isPalindrom(i * j)) {
                    return String.valueOf(i * j);
                }
            }
        }
        return null;
    }
}
