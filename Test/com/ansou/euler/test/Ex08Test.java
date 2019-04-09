package com.ansou.euler.test;

import com.ansou.euler.Ex08;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex08Test {

    private com.ansou.euler.Ex08 ex08;

    @Before
    public void setUp() throws Exception {
        ex08 = new Ex08();
    }

    @Test
    public void run() {
        Assert.assertEquals("23514624000", ex08.run());
    }
}