package com.ansou.euler;

public class Ex51 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex51().run());
    }

    private boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }

    private boolean[] primeTab(int end) {
        boolean[] primeArray = new boolean[end + 1];;

        for (int i = 0; i <= end; i++) {
            primeArray[i] = isPrime(i);
        }
        return primeArray;
    }

    private int[] getAllCaseNumbers(int i) {
        int[] numbers = new int[];

        return numbers;
    }

    @Override
    public String run() {
        boolean[] primeArray = primeTab(57000);
        int count = 0;
        for (int i = 0; i < primeArray.length; i++) {
            if (!primeArray[i])
                continue;
            else {
                count = 0;
                int[] numbers = getAllCaseNumbers(i);
                for (int j = 0; j < 10; j++) {
                    if (primeArray[numbers[j]]) {
                        count++;
                    }
                }

                if (count == 5) {
                    return String.valueOf(i);
                }
            }
        }
        return null;
    }
}
