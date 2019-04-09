package com.ansou.euler;

public class Ex12 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex12().run());
    }

    @Override
    public String run() {
                int count = 0;
        int triangleNumber = 1;
        int incrementValue = 2;
        boolean run = true;
        while (run) {
            count = 0;
            for (int i = 1; i <= Math.sqrt(triangleNumber); i++) {
                if (triangleNumber % i == 0) {
                    count+=2;
                    if (count>500) {
                        return String.valueOf(count);
                    }
                }
            }
            triangleNumber += incrementValue;
            incrementValue++;
        }
        return null;
    }
}
