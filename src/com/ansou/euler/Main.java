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









