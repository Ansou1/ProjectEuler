package com.ansou.euler.test;

import com.ansou.euler.Ex12;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex12Test {

    private com.ansou.euler.Ex12 ex12;

    @Before
    public void setUp() throws Exception {
        ex12 = new Ex12();
    }

    @Test
    public void run() {
        Assert.assertEquals("502", ex12.run());
    }
}