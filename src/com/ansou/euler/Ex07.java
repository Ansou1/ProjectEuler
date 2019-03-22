package com.ansou.euler;

public class Ex07 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex07().run());
    }

        private boolean isPrime(int number) {
        if (number %2 == 0) {
            return false;
        }
        for(int i = 3; i*i <= number; i += 2) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String run() {
        int count = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPrime(i)) {
                count++;
                if (count == 10001) {
                    return String.valueOf(i);
                }
            }
        }
        return null;
    }
}
