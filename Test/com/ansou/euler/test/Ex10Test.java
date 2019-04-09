package com.ansou.euler.test;

import com.ansou.euler.Ex10;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex10Test {

    private com.ansou.euler.Ex10 ex10;

    @Before
    public void setUp() throws Exception {
        ex10 = new Ex10();
    }

    @Test
    public void run() {
        Assert.assertEquals("142913828922", ex10.run());
    }
}