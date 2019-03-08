package com.ansou.euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.*;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.time.LocalDate;
import java.math.*;
import java.util.*;
import java.io.IOException;
import java.io.File;

//"/Users/simondaguenet/Desktop/p022_names.txt"

//public class Main {
//    public static void main(String[] args) {
//    }
//}


public class Main {
    public static boolean isPalindrom(Integer number) {
        number = Math.abs(number);
        StringBuilder input1 = new StringBuilder();
        input1.append(number.toString());
        input1.reverse();
        return number.toString().equals(input1.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(-121));
    }
}


//public class Main {
//
//    private static boolean isPrime(int num) {
//
//        if (num == 2)
//            return true;
//        if (num < 2 || num % 2 == 0)
//            return false;
//        for (int i = 3; i * i <= num; i += 2)
//            if (num % i == 0)
//                return false;
//        return true;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<Integer>();
//        int sum = 0;
//        int result = 0;
//        int maxRun = -1;
//        for (int i = 2; i < 1000000; i++) {
//            if (isPrime(i)) {
//                myList.add(i);
//            }
//        }
//
//        for (int i = 0; i < myList.size(); i++) {  // For each index of a starting prime number
//            sum = 0;
//            for (int j = i; j < myList.size(); j++) {  // For each end index (inclusive)
//                sum += myList.get(j);
//                if (sum > 1000000)
//                    break;
//                else if (j - i > maxRun && sum > result && isPrime(sum)) {
//                    result = sum;
//                    maxRun = j - i;
//                }
//            }
//        }
//        System.out.println(result);
//    }
//}


//public class Main {
//    private static boolean isPrime(int num) {
//        if (num == 2)
//            return true;
//        if (num < 2 || num % 2 == 0)
//            return false;
//        for (int i = 3; i * i <= num; i += 2)
//            if (num % i == 0)
//                return false;
//        return true;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 1488; ; i++) {
//
//                if (isPrime(i) && isPrime(i + 3330) && isPrime(i + 6660)) {
//
//                    char first [] = Integer.toString(i).toCharArray();
//                    char second [] = Integer.toString(i+3330).toCharArray();
//                    char third [] = Integer.toString(i+6660).toCharArray();
//
//                    Arrays.sort(first);
//                    Arrays.sort(second);
//                    Arrays.sort(third);
//
//                    if (Arrays.equals(first, second) && Arrays.equals(first, third)) {
//                        System.out.println(Integer.toString(i) + Integer.toString(i + 3330) + Integer.toString(i + 6660));
//                        break;
//                    }
//                }
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        BigInteger sum = new BigInteger("0");
//        for (int n = 1; n <= 1000; n++) {
//            sum = sum.add(new BigInteger(Integer.toString(n)).pow(n));
//        }
//        System.out.println(sum.toString().substring(sum.toString().length() - 10,sum.toString().length()));
//    }
//}


//public class Main {
//
//    private static boolean has4PrimeFactors(int nbr) {
//        int count = 0;
//        for (int i = 2, end = (int)Math.sqrt(nbr); i <= end; i++) {
//            if (nbr % i == 0) {
//                do nbr /= i;
//                while (nbr % i == 0);
//                count++;
//                end = (int)Math.sqrt(nbr);
//            }
//        }
//        if (nbr > 1)
//            count++;
//        return count == 4;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 134043; ; i++) {
//            if (has4PrimeFactors(i + 0) && has4PrimeFactors(i + 1) && has4PrimeFactors(i + 2) && has4PrimeFactors(i + 3)) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}

//public class Main {
//    private static boolean isPrime(int num) {
//        if (num == 2)
//            return true;
//        if (num < 2 || num % 2 == 0)
//            return false;
//        for (int i = 3; i * i <= num; i += 2)
//            if (num % i == 0)
//                return false;
//        return true;
//    }
//
//    private static boolean satisfiesConjecture(int n) {
//        if (n % 2 == 0 || isPrime(n))
//            return true;
//
//        // Now n is an odd composite number
//        for (int i = 1; i * i * 2 <= n; i++) {
//            if (isPrime(n - i * i * 2))
//                return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 9; ; i += 2) {
//            if (!satisfiesConjecture(i)) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        long a = 286, b = 0, c = 0;
//
//        for(;!(a*(a+1)/2 == b*(3*b-1)/2 && b*(3*b-1)/2 == c*(2*c-1));)
//        {
//            while (a*(a+1)/2 < b*(3*b-1)/2 || a*(a+1)/2 < c*(2*c-1)) a++;
//            while (b*(3*b-1)/2 < a*(a+1)/2 || b*(3*b-1)/2 < c*(2*c-1)) b++;
//            while (c*(2*c-1) < b*(3*b-1)/2 || c*(2*c-1) < a*(a+1)/2) c++;
//        }
//
//        System.out.println(a + " " + b + " " +c);
//    }
//}

//public class Main {
//
//    private static boolean isPentagonal(int number){
//        return (1 + Math.pow(1 + 24 * number, 0.5)) / 6 == (int) (1 + Math.pow(1 + 24 * number,
//                0.5)) / 6;
//    }
//
//    private static int pentagonal(int n){
//        return n * (3 * n - 1) / 2;
//    }
//
//    public static void main(String[] args) {
//        int n = 1;
//        boolean outerLoop = true;
//        int D = 0;
//        while(outerLoop){
//            for(int i = 1; i < n; i++){
//                if(isPentagonal(pentagonal(n) + pentagonal(i)) && isPentagonal(pentagonal(n) -
//                        pentagonal(i))){
//                    D = pentagonal(n) - pentagonal(i);
//                    outerLoop = false;
//                    break;
//                }
//            }
//            n++;
//        }
//        System.out.println(D);
//    }
//}

//public class Main {
//
//    private static int[] DIVISIBILITY_TESTS = {2, 3, 5, 7, 11, 13, 17};
//
//    private static boolean divisiblePandigitalNumber(String value) {
//        for (int i = 1; i < 8; i++) {
//            String split = value.substring(i, i+3);
//            if (Integer.parseInt(split) % DIVISIBILITY_TESTS[(i - 1)] != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean isPandigital(String s) {
//        if (s.length() != 10)
//            return false;
//        char[] temp = s.toCharArray();
//        Arrays.sort(temp);
//        return new String(temp).equals("0123456789");
//    }
//    // 1406357289
//    public static void main(String[] args) {
//        BigInteger result = new BigInteger("0");
//        BigInteger limit = new BigInteger("10000000000");
//        BigInteger i = new BigInteger("1000000000");
//        while (!i.equals(limit)) {
//            if (isPandigital(i.toString())) {
//                if (divisiblePandigitalNumber(i.toString())) {
//                    System.out.println(i.toString());
//                    result = result.add(i);
//                }
//            }
//            i = i.add(new BigInteger("1"));
//        }
//        System.out.println(result.toString());
//    }
//}


//public class Main {
//
//    //private static int sequenceTriangle [] = new int[1000];
//    private static List<Integer> sequenceTriangle = new ArrayList<Integer>();
//
//    private static boolean isTriangleWord(String word) {
//        int sum = 0;
//        for (int i = 0; i < word.length(); i++) {
//            sum += word.charAt(i) - 'A' + 1;
//        }
//        return sequenceTriangle.contains(sum);
//    }
//
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 1000; i++) {
//            sequenceTriangle.add((int)((0.5*(i + 1))*(i + 2)));
//        }
//
//        try (BufferedReader br = new BufferedReader(new FileReader("/Users/simondaguenet/Desktop/p042_words.txt"))) {
//            String [] result = {""};
//            String line;
//            while ((line = br.readLine()) != null) {
//                result = line.replace("\"", "").split(",");
//            }
//            Arrays.sort(result);
//
//            for (int i = 0; i < result.length; i++) {
//                if (isTriangleWord(result[i]))
//                    count++;
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(count);
//    }
//}

//public class Main {
//
//    private static boolean isPrime(int num) {
//        if (num == 2)
//            return true;
//        if (num < 2 || num % 2 == 0)
//            return false;
//        for (int i = 3; i * i <= num; i += 2)
//            if (num % i == 0)
//                return false;
//        return true;
//    }
//
//    private static boolean isPandigital(String s) {
//        if (s.length() != 7)
//            return false;
//        char[] temp = s.toCharArray();
//        Arrays.sort(temp);
//        return new String(temp).equals("1234567");
//    }
//
//    public static void main(String[] args) {
//        int number = 0;
//        for (int i = 1000; i < 10000000; i++) {
//            if (isPandigital(Integer.toString(i)) && isPrime(i)) {
//                number = Math.max(number, i);
//            }
//        }
//        System.out.println(number);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        StringBuilder num = new StringBuilder();
//
//        for (int i = 1; num.length() < 1000001; i++)
//            num.append(String.valueOf(i));
//
//        int value =
//                (num.charAt(0) - '0') *
//                        (num.charAt(9) - '0') *
//                        (num.charAt(99) - '0') *
//                        (num.charAt(999) - '0') *
//                        (num.charAt(9999) - '0') *
//                        (num.charAt(99999) - '0') *
//                        (num.charAt(999999) - '0');
//
//        System.out.println(value);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int count = 0;
//        int result = 0;
//        int index = 0;
//        for (int p = 1; p <= 1000; p++) {
//            count = 0;
//            for (int a = 1; a < p; a++) {
//                for (int b = 1; b < p; b++) {
//                    if (a*a + b*b == (p - (a+b))*(p - (a+b)))
//                        count++;
//                }
//            }
//            if (count > result) {
//                result = count;
//                index = p;
//            }
//        }
//        System.out.println(index);
//    }
//}

//public class Main {
//
//    private static boolean isPandigital(String s) {
//        if (s.length() != 9)
//            return false;
//        char[] temp = s.toCharArray();
//        Arrays.sort(temp);
//        return new String(temp).equals("123456789");
//    }
//
//    public static void main(String[] args) {
//        int max = -1;
//        for (int n = 2; n <= 9; n++) {
//            for (int i = 1; i < Math.pow(10, 9 / n); i++) {
//                String concat = "";
//                for (int j = 1; j <= n; j++)
//                    concat += i * j;
//                if (isPandigital(concat))
//                    max = Math.max(Integer.parseInt(concat), max);
//            }
//        }
//        System.out.println(max);
//    }
//}

//public class Main {
//    private static boolean isPrime(int num)
//    {
//        if (num == 2)
//            return true;
//        if (num < 2 || num % 2 == 0)
//            return false;
//        for (int i = 3; i * i <= num; i += 2)
//            if (num % i == 0)
//                return false;
//        return true;
//    }
//
//    private static boolean isTruncable(Integer number) {
//
//        for (int i = 1; i <= number; i*=10) {
//            if (!isPrime(number%(10 * i)))
//                return  false;
//        }
//
//        for (; number != 0; number /= 10) {
//            if (!isPrime(number))
//                return  false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 8; i <= 1000000; i++) {
//            if (isPrime(i)) {
//                if (isTruncable(i)) {
//                    sum += i;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}


//public class Main {
//    public static boolean isPalindrom(BigInteger number) {
//        StringBuilder input1 = new StringBuilder();
//        input1.append(number.toString());
//        input1.reverse();
//        return number.toString().equals(input1.toString());
//    }
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 1000000; i++) {
//            if (isPalindrom(BigInteger.valueOf(i)) && isPalindrom(new BigInteger(Integer.toBinaryString(i))))
//                sum += i;
//        }
//        System.out.println(sum);
//    }
//}

//public class Main {
//
//    private static boolean isPrime(int number) {
//        if (number % 2 == 0) {
//            return false;
//        }
//        for (int i = 3; i * i <= number; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean isCircularprime(int number) {
//        String s = Integer.toString(number);
//        for (int i = 0; i < s.length(); i++) {
//            if (!isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i))))
//                return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 1000000; i++) {
//            if (isPrime(i))
//                if (isCircularprime(i))
//                    count++;
//        }
//        System.out.println(count);
//    }
//}

//public class Main {
//    private static int factorial(int n){
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int sum;
//        int result = 0;
//        for (int i = 3; i < 1000000; i++) {
//            sum = 0;
//            String tmp = String.valueOf(i);
//            for (int j = 0; j < tmp.length(); j++) {
//                sum += factorial(tmp.charAt(j) - '0');
//            }
//            if (sum == i) {
//                result += i;
//            }
//        }
//        System.out.println(result);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        double a = 0, b = 0, x = 0, y = 0;
//        ArrayList<Double> products = new ArrayList<Double>();
//        double lct = 1;
//
//        for (int i = 11; i < 100; i++)
//            for (int j = 11; j < 100; j++) {
//                x = (String.valueOf(i).charAt(0) - '0');
//                y = (String.valueOf(j).charAt(1) - '0');
//                a = (String.valueOf(i).charAt(1) - '0');
//                b = (String.valueOf(j).charAt(0) - '0');
//
//                if ((double) i / j == x / y && y != 0 && (double) i / j < 1 && a == b) {
//                    System.out.println(i + "/" + j + " " + x + "/" + y);
//                    products.add((double) i / j);
//                }
//            }
//
//        for (double d : products)
//            lct *= d;
//
//        System.out.println(lct);
//
//    }
//}

//public class Main {
//    private static boolean hasPandigitalProduct(int n) {
//        // Find and examine all factors of n
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0 && isPandigital("" + n + i + n/i))
//                return true;
//        }
//        return false;
//    }
//
//
//    private static boolean isPandigital(String s) {
//        if (s.length() != 9)
//            return false;
//        char[] temp = s.toCharArray();
//        Arrays.sort(temp);
//        return new String(temp).equals("123456789");
//    }
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i < 10000; i++) {
//            if (hasPandigitalProduct(i))
//                sum += i;
//        }
//        System.out.println(sum);
//    }
//}

//public class Main {
//    public static int findCombinationsCount(int sum, int vals[]) {
//        if (sum < 0) {
//            return 0;
//        }
//        if (vals == null || vals.length == 0) {
//            return 0;
//        }
//
//        int dp[] = new int[sum + 1];
//        dp[0] = 1;
//        for (int i = 0; i < vals.length; ++i) {
//            for (int j = vals[i]; j <= sum; ++j) {
//                dp[j] += dp[j - vals[i]];
//            }
//        }
//        return dp[sum];
//    }
//
//    public static void main(String[] args) {
//        int [] vals = {1, 2, 5, 10, 20, 50, 100, 200};
//        System.out.println(findCombinationsCount(200, vals));
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        String tmp;
//        int result = 0;
//        int sum = 0;
//
//        for (int nbr = 2; nbr <= 1000000; nbr++) {
//            tmp = String.valueOf(nbr);
//            sum = 0;
//            for (int i = 0; i < tmp.length(); i++) {
//                sum += Math.pow(tmp.charAt(i) - '0', 5);
//            }
//            if (sum == nbr)
//                result += sum;
//        }
//        System.out.println(result);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Set<Double> set = new HashSet<Double>();
//
//        for (int a = 2; a <= 100; a++) {
//            for (int b = 2; b <= 100; b++) {
//                set.add(Math.pow(a, b));
//            }
//        }
//        System.out.println(set.size());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        long result = 1;
//        for (int i = 3; i <= 1001; i+=2) {
//            result += 4 * i * i - 6 * (i - 1);
//        }
//        System.out.println(result);
//    }
//}

//public class Main {
//    private static boolean isPrime(int number) {
//        if (number % 2 == 0) {
//            return false;
//        }
//        for (int i = 3; i * i <= number; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int valueA = 0;
//        int valueB = 0;
//        int result = 0;
//
//        for (int b = -1000; b <= 1000; b++) {
//            for (int a = -1000; a <= 1000; a++) {
//                int count = 0;
//                for (int n = 0; ; n++) {
//                    if (n * n + a * n + b > 0 && isPrime(n * n + a * n + b)) {
//                        count++;
//                    }
//                    else {
//                        break;
//                    }
//                }
//                if (count > result) {
//                    result = count;
//                    valueA = a;
//                    valueB = b;
//                }
//            }
//        }
//        System.out.println(valueA*valueB);
//    }
//}


//public class Main {
//
//    private static int getCycleLength(int n) {
//        Map<Integer,Integer> stateToIter = new HashMap<>();
//        int state = 1;
//        for (int iter = 0; ; iter++) {
//            if (stateToIter.containsKey(state))
//                return iter - stateToIter.get(state);
//            else {
//                stateToIter.put(state, iter);
//                state = state * 10 % n;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int bestNumber = 0;
//        int bestLength = 0;
//        for (int i = 1; i <= 1000; i++) {
//            int len = getCycleLength(i);
//            if (len > bestLength) {
//                bestNumber = i;
//                bestLength = len;
//            }
//        }
//        System.out.println(bestNumber);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        BigInteger f1 = new BigInteger("1");
//        BigInteger f2 = new BigInteger("1");
//        BigInteger tmp = BigInteger.ZERO;
//        for (int i = 3; ; i++) {
//            tmp = f2;
//            f2 = tmp.add(f1);
//            f1 = tmp;
//            if (f2.toString().length() >= 1000) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}


//This is the paper algorithm in a table form based in counting permutations to change the target digit
//        For exapmple the permutation 36288 =(9!)
//        produces 1023456789
//
//        DIGIT  FACTORIAL DIVIS	RESIDUAL
//        999999
//        9	        362880	  2	    274239
//        8	        40320	  6	    32319
//        7	        5040	  6	    2079
//        6	        720	      2	    639
//        5	        120	      5	    39
//        4	        24	      1	    15
//        3	        6	      2	    3
//        2	        2	      1	    1
//        1	        1	      1	    0
//
//        The divisor gives you the position of the next digit of the permutation 2 gives 2 (0,1,2), we scratch 2 from the list,   6 gives 7 (0,1,3,4,5,6,7) the next 6 gives 8 (0,1,3,4,5,6,8) and so on.

//public class Main {
//
//    private static boolean[] isAbundant = new boolean[28124];
//
//    private static int sqrt(int x) {
//        if (x < 0)
//            throw new IllegalArgumentException("Square root of negative number");
//        int y = 0;
//        for (int i = 1 << 15; i != 0; i >>>= 1) {
//            y |= i;
//            if (y > 46340 || y * y > x)
//                y ^= i;
//        }
//        return y;
//    }
//
//    private static boolean isAbundant(int n) {
//        int sum = 1;
//        int end = sqrt(n);
//        for (int i = 2; i <= end; i++) {
//            if (n % i == 0)
//                sum += i + n / i;
//        }
//        if (end * end == n)
//            sum -= end;
//        return sum > n;
//    }
//
//    private static boolean isSumOf2Abundants(int n) {
//        for (int i = 0; i <= n; i++) {
//            if (isAbundant[i] && isAbundant[n - i])
//                return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 1; i < isAbundant.length; i++)
//            isAbundant[i] = isAbundant(i);
//
//        int sum = 0;
//        for (int i = 1; i <= 28123; i++) {
//            if (!isSumOf2Abundants(i))
//                sum += i;
//        }
//        System.out.println(sum);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        List<String> myFirstNameList = new ArrayList<String>();
//        String [] result = {""};
//        long sum = 0;
//        try (BufferedReader br = new BufferedReader(new FileReader("/Users/simondaguenet/Desktop/p022_names.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                result = line.replace("\"", "").split(",");
//            }
//            Arrays.sort(result);
//
//            for (int i = 0; i < result.length; i++)
//            {
//                int value = 0;
//                for (int j = 0; j < result[i].length(); j++) {
//                    value += result[i].charAt(j) - 'A' + 1;
//                }
//                sum += value * (i + 1);
//            }
//            System.out.println(sum);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

//21
//public class Main {
//
//    private static int NDivisor(int value) {
//        int sum = 0;
//        for (int i = 1; i < value; i++) {
//            if (value % i == 0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
//
//    private static boolean isAmicable(int value) {
//        int sumDivisorA = NDivisor(value);
//
//        return NDivisor(sumDivisorA) == value && sumDivisorA != value;
//    }
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i < 10000; i++) {
//            if (isAmicable(i)) {
//                sum += i;
//            }
//        }
//        System.out.println("Result => " + sum);
//
//    }
//}

//20
//public class Main {
//    private static BigInteger factorial(int n){
//        BigInteger result = new BigInteger("1");
//        for (int i = 2; i < n; i++) {
//            result = result.multiply(new BigInteger(Integer.toString(i)));
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String value = (factorial(100)).toString();
//        int sum = 0;
//        for (int i = 0; i < value.length(); i++) {
//            sum += value.charAt(i) - '0';
//        }
//        System.out.println(sum);
//    }
//}

//19
//public class Main {
//    private static int findDay(int month, int day, int year) {
//        int m = (month - 3 + 4800) % 4800;
//        int y = (year + m / 12) % 400;
//        m %= 12;
//        return ((y + y/4 - y/100 + (13 * m + 2) / 5 + day + 2) % 7) == 0 ? 1: 0;
//    }
//
//    public static void main(String[] args) {
//        int result = 0;
//        for (int years = 1901; years <= 2000; years++) {
//            for (int months = 1; months <= 12; months++) {
//                result += findDay(months, 01, years);
//            }
//        }
//        System.out.println(result);
//    }
//}


//18
//public class Main {
//
//    private static  int[][] triangle = {  // Mutable
//            {75},
//            {95,64},
//            {17,47,82},
//            {18,35,87,10},
//            {20, 4,82,47,65},
//            {19, 1,23,75, 3,34},
//            {88, 2,77,73, 7,63,67},
//            {99,65, 4,28, 6,16,70,92},
//            {41,41,26,56,83,40,80,70,33},
//            {41,48,72,33,47,32,37,16,94,29},
//            {53,71,44,65,25,43,91,52,97,51,14},
//            {70,11,33,28,77,73,17,78,39,68,17,57},
//            {91,71,52,38,17,14,91,43,58,50,27,29,48},
//            {63,66, 4,68,89,53,67,30,73,16,69,87,40,31},
//            { 4,62,98,27,23, 9,70,98,73,93,38,53,60, 4,23},
//    };
//
//    public static void main(String[] args) {
//        for (int i = triangle.length - 2; i >= 0; i--) {
//            for (int j = 0; j < triangle[i].length; j++)
//                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
//        }
//        System.out.println(triangle[0][0]);
//    }
//}


//17
//public class Main {
//
//    private static int countLetterNumber(int value) {
//        if (0 <= value && value < 20) {
//            return ONES[value].length();
//        }
//        else if (20 <= value && value < 100) {
//            return TENS[value / 10].length() + (value % 10 != 0 ? ONES[value % 10].length() : "".length());
//        }
//        else if (100 <= value && value < 1000) {
//            return ONES[value / 100].length() + "hundred".length() + (value % 100 != 0 ? "and".length() + countLetterNumber(value % 100) : "".length());
//        }
//        else {
//            System.out.println(value);
//            throw new IllegalArgumentException();
//        }
//    }
//
//    private static String[] ONES = {
//            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
//            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//
//    private static String[] TENS = {
//            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//
//    public static void main(String[] args) {
//        int sum = "onethousand".length();
//        for (int i = 1; i < 1000; i++) {
//            sum += countLetterNumber(i);
//        }
//        System.out.println(sum);
//
//    }
//}

//16
//public class Main {
//
//    public static void main(String[] args) {
//        String temp = BigInteger.ONE.shiftLeft(1000).toString();
//        int sum = 0;
//        for (int i = 0; i < temp.length(); i++)
//            sum += temp.charAt(i) - '0';
//        System.out.println(Integer.toString(sum));
//    }
//}

//15
//public class Main {
//    private static long binomial(int n, int k)
//    {
//        if (k>n-k)
//            k=n-k;
//
//        long b=1;
//        for (int i=1, m=n; i<=k; i++, m--)
//            b=b*m/i;
//        return b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(binomial(40, 20));
//    }
//}


//14
//public class Main {
//    public static void main(String[] args) {
//        int number = 1000000;
//
//        long sequenceLength = 0;
//        long startingNumber = 0;
//        long sequence;
//
//        for (int i = 2; i <= number; i++) {
//            int length = 1;
//            sequence = i;
//            while (sequence != 1) {
//                if ((sequence % 2) == 0) {
//                    sequence = sequence / 2;
//                } else {
//                    sequence = sequence * 3 + 1;
//                }
//                length++;
//            }
//
//            if (length > sequenceLength) {
//                sequenceLength = length;
//                startingNumber = i;
//            }
//        }
//        System.out.println(startingNumber);
//    }
//}

//EX13
//public class Main {
//    public static void main(String[] args) {
//
//        List<BigInteger> list = new ArrayList<BigInteger>() {{
//            add(new BigInteger("37107287533902102798797998220837590246510135740250"));
//            add(new BigInteger("46376937677490009712648124896970078050417018260538"));
//            add(new BigInteger("74324986199524741059474233309513058123726617309629"));
//            add(new BigInteger("91942213363574161572522430563301811072406154908250"));
//            add(new BigInteger("23067588207539346171171980310421047513778063246676"));
//            add(new BigInteger("89261670696623633820136378418383684178734361726757"));
//            add(new BigInteger("28112879812849979408065481931592621691275889832738"));
//            add(new BigInteger("44274228917432520321923589422876796487670272189318"));
//            add(new BigInteger("47451445736001306439091167216856844588711603153276"));
//            add(new BigInteger("70386486105843025439939619828917593665686757934951"));
//            add(new BigInteger("62176457141856560629502157223196586755079324193331"));
//            add(new BigInteger("64906352462741904929101432445813822663347944758178"));
//            add(new BigInteger("92575867718337217661963751590579239728245598838407"));
//            add(new BigInteger("58203565325359399008402633568948830189458628227828"));
//            add(new BigInteger("80181199384826282014278194139940567587151170094390"));
//            add(new BigInteger("35398664372827112653829987240784473053190104293586"));
//            add(new BigInteger("86515506006295864861532075273371959191420517255829"));
//            add(new BigInteger("71693888707715466499115593487603532921714970056938"));
//            add(new BigInteger("54370070576826684624621495650076471787294438377604"));
//            add(new BigInteger("53282654108756828443191190634694037855217779295145"));
//            add(new BigInteger("36123272525000296071075082563815656710885258350721"));
//            add(new BigInteger("45876576172410976447339110607218265236877223636045"));
//            add(new BigInteger("17423706905851860660448207621209813287860733969412"));
//            add(new BigInteger("81142660418086830619328460811191061556940512689692"));
//            add(new BigInteger("51934325451728388641918047049293215058642563049483"));
//            add(new BigInteger("62467221648435076201727918039944693004732956340691"));
//            add(new BigInteger("15732444386908125794514089057706229429197107928209"));
//            add(new BigInteger("55037687525678773091862540744969844508330393682126"));
//            add(new BigInteger("18336384825330154686196124348767681297534375946515"));
//            add(new BigInteger("80386287592878490201521685554828717201219257766954"));
//            add(new BigInteger("78182833757993103614740356856449095527097864797581"));
//            add(new BigInteger("16726320100436897842553539920931837441497806860984"));
//            add(new BigInteger("48403098129077791799088218795327364475675590848030"));
//            add(new BigInteger("87086987551392711854517078544161852424320693150332"));
//            add(new BigInteger("59959406895756536782107074926966537676326235447210"));
//            add(new BigInteger("69793950679652694742597709739166693763042633987085"));
//            add(new BigInteger("41052684708299085211399427365734116182760315001271"));
//            add(new BigInteger("65378607361501080857009149939512557028198746004375"));
//            add(new BigInteger("35829035317434717326932123578154982629742552737307"));
//            add(new BigInteger("94953759765105305946966067683156574377167401875275"));
//            add(new BigInteger("88902802571733229619176668713819931811048770190271"));
//            add(new BigInteger("25267680276078003013678680992525463401061632866526"));
//            add(new BigInteger("36270218540497705585629946580636237993140746255962"));
//            add(new BigInteger("24074486908231174977792365466257246923322810917141"));
//            add(new BigInteger("91430288197103288597806669760892938638285025333403"));
//            add(new BigInteger("34413065578016127815921815005561868836468420090470"));
//            add(new BigInteger("23053081172816430487623791969842487255036638784583"));
//            add(new BigInteger("11487696932154902810424020138335124462181441773470"));
//            add(new BigInteger("63783299490636259666498587618221225225512486764533"));
//            add(new BigInteger("67720186971698544312419572409913959008952310058822"));
//            add(new BigInteger("95548255300263520781532296796249481641953868218774"));
//            add(new BigInteger("76085327132285723110424803456124867697064507995236"));
//            add(new BigInteger("37774242535411291684276865538926205024910326572967"));
//            add(new BigInteger("23701913275725675285653248258265463092207058596522"));
//            add(new BigInteger("29798860272258331913126375147341994889534765745501"));
//            add(new BigInteger("18495701454879288984856827726077713721403798879715"));
//            add(new BigInteger("38298203783031473527721580348144513491373226651381"));
//            add(new BigInteger("34829543829199918180278916522431027392251122869539"));
//            add(new BigInteger("40957953066405232632538044100059654939159879593635"));
//            add(new BigInteger("29746152185502371307642255121183693803580388584903"));
//            add(new BigInteger("41698116222072977186158236678424689157993532961922"));
//            add(new BigInteger("62467957194401269043877107275048102390895523597457"));
//            add(new BigInteger("23189706772547915061505504953922979530901129967519"));
//            add(new BigInteger("86188088225875314529584099251203829009407770775672"));
//            add(new BigInteger("11306739708304724483816533873502340845647058077308"));
//            add(new BigInteger("82959174767140363198008187129011875491310547126581"));
//            add(new BigInteger("97623331044818386269515456334926366572897563400500"));
//            add(new BigInteger("42846280183517070527831839425882145521227251250327"));
//            add(new BigInteger("55121603546981200581762165212827652751691296897789"));
//            add(new BigInteger("32238195734329339946437501907836945765883352399886"));
//            add(new BigInteger("75506164965184775180738168837861091527357929701337"));
//            add(new BigInteger("62177842752192623401942399639168044983993173312731"));
//            add(new BigInteger("32924185707147349566916674687634660915035914677504"));
//            add(new BigInteger("99518671430235219628894890102423325116913619626622"));
//            add(new BigInteger("73267460800591547471830798392868535206946944540724"));
//            add(new BigInteger("76841822524674417161514036427982273348055556214818"));
//            add(new BigInteger("97142617910342598647204516893989422179826088076852"));
//            add(new BigInteger("87783646182799346313767754307809363333018982642090"));
//            add(new BigInteger("10848802521674670883215120185883543223812876952786"));
//            add(new BigInteger("71329612474782464538636993009049310363619763878039"));
//            add(new BigInteger("62184073572399794223406235393808339651327408011116"));
//            add(new BigInteger("66627891981488087797941876876144230030984490851411"));
//            add(new BigInteger("60661826293682836764744779239180335110989069790714"));
//            add(new BigInteger("85786944089552990653640447425576083659976645795096"));
//            add(new BigInteger("66024396409905389607120198219976047599490197230297"));
//            add(new BigInteger("64913982680032973156037120041377903785566085089252"));
//            add(new BigInteger("16730939319872750275468906903707539413042652315011"));
//            add(new BigInteger("94809377245048795150954100921645863754710598436791"));
//            add(new BigInteger("78639167021187492431995700641917969777599028300699"));
//            add(new BigInteger("15368713711936614952811305876380278410754449733078"));
//            add(new BigInteger("40789923115535562561142322423255033685442488917353"));
//            add(new BigInteger("44889911501440648020369068063960672322193204149535"));
//            add(new BigInteger("41503128880339536053299340368006977710650566631954"));
//            add(new BigInteger("81234880673210146739058568557934581403627822703280"));
//            add(new BigInteger("82616570773948327592232845941706525094512325230608"));
//            add(new BigInteger("22918802058777319719839450180888072429661980811197"));
//            add(new BigInteger("77158542502016545090413245809786882778948721859617"));
//            add(new BigInteger("72107838435069186155435662884062257473692284509516"));
//            add(new BigInteger("20849603980134001723930671666823555245252804609722"));
//            add(new BigInteger("53503534226472524250874054075591789781264330331690"));
//        }};
//
//        Iterator<BigInteger> iterator = list.iterator();
//        BigInteger result = new BigInteger("0");
//        while (iterator.hasNext()) {
//            result = result.add(iterator.next());
//        }
//        System.out.println(result);
//    }
//}

//EX12
//public class Main {
//    public static void main(String[] args) {
//        int count = 0;
//        int triangleNumber = 1;
//        int incrementValue = 2;
//        boolean run = true;
//        while (run) {
//            count = 0;
//            for (int i = 1; i <= Math.sqrt(triangleNumber); i++) {
//                if (triangleNumber % i == 0) {
//                    count+=2;
//                    if (count>500) {
//                        System.out.print(triangleNumber+": ");
//                        System.out.println(count);
//                        run = false;
//                        break;
//                    }
//                }
//            }
//            triangleNumber += incrementValue;
//            incrementValue++;
//        }
//    }
//}

//EX11
//public class Main {
//    public static void main(String[] args) {
//        Integer [][] grid =
//                {{8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
//                {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
//                {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
//                {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
//                {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
//                {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
//                {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
//                {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
//                {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
//                {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
//                {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
//                {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
//                {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
//                {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
//                {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
//                {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
//                {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
//                {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
//                {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
//                {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}};
//
//        Integer result = 0;
//        for (int i = 3; i <= 16; i++) {
//            for (int j = 3; j <= 16; j++) {
//                //LEFT
//                if (grid[i][j] * grid[i][j-1] * grid[i][j-2] * grid[i][j-3] > result) {
//                    result = grid[i][j] * grid[i][j-1] * grid[i][j-2] * grid[i][j-3];
//                }
//                //RIGHT
//                if (grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3] > result) {
//                    result = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
//                }
//                //DOWN
//                if (grid[i][j] * grid[i-1][j] * grid[i-2][j] * grid[i-3][j] > result) {
//                    result = grid[i][j] * grid[i-1][j] * grid[i-2][j] * grid[i-3][j];
//                }
//                //TOP
//                if (grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j] > result) {
//                    result = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
//                }
//                if (grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3] > result) {
//                    result = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
//                }
//                if (grid[i][j] * grid[i-1][j-1] * grid[i-2][j-2] * grid[i-3][j-3] > result) {
//                    result = grid[i][j] * grid[i-1][j-1] * grid[i-2][j-2] * grid[i-3][j-3];
//                }
//                if (grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3] > result) {
//                    result = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
//                }
//                if (grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3] > result) {
//                    result = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
//                }
//            }
//        }
//        System.out.println(result.toString());
//
//    }
//}

//EX10
//public class Main {
//    private static boolean isPrime(int number) {
//        if (number % 2 == 0) {
//            return false;
//        }
//        for (int i = 3; i * i <= number; i += 2) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        long result = 2;
//        for (int i = 2; i < 2000000; i++) {
//            if (isPrime(i)) {
//                result += i;
//            }
//        }
//        System.out.println(result);
//    }
//}

//EX 9
//public class Main {
//    public static void main(String[] args) {
//        for (int a = 0; a <= 1000; a++) {
//            for (int b = a + 1; b <= 1000 - a; b++) {
//                int c = 1000 - a - b;
//                if (c > b && c * c == a * a + b * b) {
//                    System.out.print(a * b * c);
//                    return;
//                }
//            }
//        }
//    }
//}

//EX 8
//public class Main {
//    public static void main(String[] args) {
//        String data = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
//        long maxProd = -1;
//        for (int i = 0; i + 13 <= data.length(); i++) {
//            long prod = 1;
//            for (int j = 0; j < 13; j++)
//                prod *= data.charAt(i + j) - '0';
//            maxProd = Math.max(prod, maxProd);
//        }
//        System.out.println(maxProd);
//    }
//}

//Exo 7
//public class Main {
//
//    private static boolean isPrime(int number) {
//        if (number %2 == 0) {
//            return false;
//        }
//        for(int i = 3; i*i <= number; i += 2) {
//            if(number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i < 1000000; i++) {
//            if (isPrime(i)) {
//                count++;
//                System.out.println("Count:" + count + ", " + i);
//                if (count == 10001) {
//                    break;
//                }
//            }
//        }
//    }
//}

//Exo 6
//public class Main {
//    public static void main(String[] args) {
//        int sumSquares = 0;
//        int squareSum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            squareSum += i;
//            sumSquares += Math.pow(i, 2);
//        }
//        System.out.print("SquareSum = " + squareSum + ", SumSquare = " + sumSquares + ", Result = ");
//        System.out.println(Math.pow(squareSum, 2) - sumSquares);
//    }
//}

//Exo 5
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i < 1000000000; i++) {
//            int j = 1;
//            boolean quit = true;
//            while (j <= 20 && (quit)) {
//                if (i % j != 0) {
//                    quit = false;
//                }
//                if (j == 20) {
//                    System.out.println(i);
//                    break;
//                }
//                j++;
//            }
//        }
//    }
//}

//Exo 4
//public class Main {
//    public static boolean isPalindrom(Integer number) {
//        StringBuilder input1 = new StringBuilder();
//        input1.append(number.toString());
//        input1.reverse();
//        return number.toString().equals(input1.toString());
//    }
//
//    public static void main(String[] args) {
//        for (int i = 999; i > 800; i--) {
//            for (int j = 999; j > 800; j--) {
//                if (isPalindrom(i*j)) {
//                    System.out.println("Result: " + i*j + ", i = " + i + ", j = " + j);
//                }
//            }
//        }
//    }
//}

//Exo 3
//public class Main {
//    public static void main(String[] args) {
//        long number = 600851475143L;
//
//        long highestPrime = -1;
//        for (long i = 2; i <= number; ++i) {
//            if (number % i == 0) {
//                highestPrime = i;
//                number /= i;
//                --i;
//            }
//        }
//        System.out.println(highestPrime);
//    }
//}

// Second exo
//public class Main {
//    public static void main(String[] args) {
//        int first = 1;
//        int second = 2;
//        int sum = 0;
//        int tmp = 0;
//        for (int i = 1; second < 4000000; i++) {
//            if (second % 2 == 0)
//                sum = sum + second;
//            tmp = second;
//            second = tmp + first;
//            first = tmp;
//        }
//        System.out.println(sum);
//    }
//}

// First exo
//public class Main {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 1000; i++) {
//            if ((i % 5 == 0) || (i % 3 == 0)) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//    }
//}