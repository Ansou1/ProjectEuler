package com.ansou.euler.test;

import com.ansou.euler.Ex01;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class Ex01Test {

    private com.ansou.euler.Ex01 ex01;

    @Before
    public void setUp() throws Exception {
        ex01 = new Ex01();
    }

    @Test
    public void run() {
        Assert.assertEquals("233168", ex01.run());
    }
}