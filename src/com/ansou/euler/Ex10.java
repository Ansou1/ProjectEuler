package com.ansou.euler;

public class Ex10 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex10().run());
    }

        private boolean isPrime(int number) {
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String run() {
        long result = 2;
        for (int i = 2; i < 2000000; i++) {
            if (isPrime(i)) {
                result += i;
            }
        }
        return String.valueOf(result);
    }
}
