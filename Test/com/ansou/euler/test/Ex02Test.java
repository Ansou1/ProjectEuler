package com.ansou.euler.test;

import com.ansou.euler.Ex02;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex02Test {

    private com.ansou.euler.Ex02 ex02;

    @Before
    public void setUp() throws Exception {
        ex02 = new Ex02();
    }

    @Test
    public void run() {
        Assert.assertEquals("4613732", ex02.run());
    }
}