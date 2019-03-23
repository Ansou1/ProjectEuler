package com.ansou.euler;

public class Ex15 implements EulerProject {

    public static void main(String[] args) {
        System.out.println(new Ex15().run());
    }

    private String binomial(int n, int k)
    {
        if (k>n-k)
            k=n-k;

        long b=1;
        for (int i=1, m=n; i<=k; i++, m--)
            b=b*m/i;
        return String.valueOf(b);
    }

    @Override
    public String run() {
        return binomial(40, 20);
    }
}
