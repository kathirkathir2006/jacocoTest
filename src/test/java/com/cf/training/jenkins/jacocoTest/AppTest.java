package com.cf.training.jenkins.jacocoTest;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result); // 3 + 5 = 8
    }
	@Test
    public void testAdd1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(5, result); // 3 + 5 = 8
    }
}
