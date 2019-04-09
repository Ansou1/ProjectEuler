package com.ansou.euler.test;

import com.ansou.euler.Ex09;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex09Test {

    private com.ansou.euler.Ex09 ex09;

    @Before
    public void setUp() throws Exception {
        ex09 = new Ex09();
    }

    @Test
    public void run() {
        Assert.assertEquals("31875000", ex09.run());
    }
}