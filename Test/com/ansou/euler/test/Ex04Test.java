package com.ansou.euler.test;

import com.ansou.euler.Ex02;
import com.ansou.euler.Ex04;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex04Test {

    private com.ansou.euler.Ex04 ex04;

    @Test
    public void isPalindrom() {
    }

    @Before
    public void setUp() throws Exception {
        ex04 = new Ex04();
    }

    @Test
    public void run() {
        Assert.assertEquals("906609", ex04.run());
    }
}