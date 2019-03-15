package com.ansou.euler;

public class Ex03 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex03().run());
    }

    @Override
    public String run() {
        long number = 600851475143L;

        long highestPrime = -1;
        for (long i = 2; i <= number; ++i) {
            if (number % i == 0) {
                highestPrime = i;
                number /= i;
                --i;
            }
        }
        return String.valueOf(highestPrime);
    }
}
