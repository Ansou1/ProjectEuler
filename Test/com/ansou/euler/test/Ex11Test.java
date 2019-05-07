package com.ansou.euler.test;

import com.ansou.euler.Ex11;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex11Test {

    private com.ansou.euler.Ex11 ex11;

    @Before
    public void setUp() throws Exception {
        ex11 = new Ex11();
    }

    @Test
    public void run() {
        Assert.assertEquals("70600674", ex11.run());
    }

}