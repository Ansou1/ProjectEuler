package com.ansou.euler.test;

import com.ansou.euler.Ex14;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex14Test {

    private com.ansou.euler.Ex14 ex14;

    @Before
    public void setUp() throws Exception {
        ex14 = new Ex14();
    }

    @Test
    public void run() {
        Assert.assertEquals("837799", ex14.run());
    }

}