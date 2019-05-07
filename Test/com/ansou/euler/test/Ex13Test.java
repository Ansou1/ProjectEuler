package com.ansou.euler.test;

import com.ansou.euler.Ex13;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex13Test {

    private com.ansou.euler.Ex13 ex13;

    @Before
    public void setUp() throws Exception {
        ex13 = new Ex13();
    }

    @Test
    public void run() {
        Assert.assertEquals("5537376230390876637302048746832985971773659831892672", ex13.run());
    }

}