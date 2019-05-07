package com.ansou.euler.test;

import com.ansou.euler.Ex15;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex15Test {

    private com.ansou.euler.Ex15 ex15;

    @Before
    public void setUp() throws Exception {
        ex15 = new Ex15();
    }

    @Test
    public void run() {
        Assert.assertEquals("137846528820", ex15.run());
    }

}