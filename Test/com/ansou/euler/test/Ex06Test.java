package com.ansou.euler.test;

import com.ansou.euler.Ex06;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex06Test {

    private com.ansou.euler.Ex06 ex06;

    @Before
    public void setUp() throws Exception {
        ex06 = new Ex06();
    }

    @Test
    public void run() {
        Assert.assertEquals("2.516415E7", ex06.run());
    }
}