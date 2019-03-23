package com.ansou.euler;

public class Ex14 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex14().run());
    }

    @Override
    public String run() {
        int number = 1000000;

        long sequenceLength = 0;
        long startingNumber = 0;
        long sequence;

        for (int i = 2; i <= number; i++) {
            int length = 1;
            sequence = i;
            while (sequence != 1) {
                if ((sequence % 2) == 0) {
                    sequence = sequence / 2;
                } else {
                    sequence = sequence * 3 + 1;
                }
                length++;
            }

            if (length > sequenceLength) {
                sequenceLength = length;
                startingNumber = i;
            }
        }
        return String.valueOf(startingNumber);
    }
}
