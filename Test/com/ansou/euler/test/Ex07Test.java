package com.ansou.euler.test;

import com.ansou.euler.Ex07;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex07Test {

    private com.ansou.euler.Ex07 ex07;

    @Before
    public void setUp() throws Exception {
        ex07 = new Ex07();
    }

    @Test
    public void run() {
        Assert.assertEquals("104743", ex07.run());
    }
}