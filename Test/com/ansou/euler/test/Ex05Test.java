package com.ansou.euler.test;

import com.ansou.euler.Ex02;
import com.ansou.euler.Ex05;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex05Test {

    private com.ansou.euler.Ex05 ex05;

    @Before
    public void setUp() throws Exception {
        ex05 = new Ex05();
    }

    @Test
    public void run() {
        Assert.assertEquals("232792560", ex05.run());
    }
}