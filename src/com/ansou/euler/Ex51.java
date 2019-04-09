package com.ansou.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    private List<Integer> getAllCaseNumbers(int i, boolean[] primeArray) {
        List<Integer> result = Collections.emptyList();
        String str = String.valueOf(i);
        for (char c = '0'; c <= '9'; c++) {
            int cIndex = str.indexOf(c);
            if (cIndex != -1) {
                List<Integer> charPermutations = new ArrayList<Integer>();
                for (char r = (cIndex == 0) ? '1' : '0'; r <= '9'; r++) {
                    int permutation = Integer.parseInt(str.replace(c, r));
                    if (primeArray[permutation]) {
                        charPermutations.add(permutation);
                    }
                }
                if (charPermutations.size() > result.size()) {
                    result = charPermutations;
                }
            }
        }
        return result;
    }

    @Override
    public String run() {
        boolean[] primeArray = primeTab(1000000);
        for (int i = 0; i < primeArray.length; i++) {
            if (!primeArray[i])
                continue;
            else {
                List<Integer> numbers = getAllCaseNumbers(i, primeArray);
                if (numbers.size() == 8) {
                    return String.valueOf(i);
                }
            }
        }
        return null;
    }
}
