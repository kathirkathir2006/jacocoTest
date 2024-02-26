package com.cf.training.jenkins.jacocoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	  @Test
	    public void testNameMkyong() {

	        MessageBuilder obj = new MessageBuilder();
	        assertEquals("Hello mkyong", obj.getMessage("mkyong"));

	    }
	public void testNameMkyong() {

	        MessageBuilder obj = new MessageBuilder();
	        assertEquals("Hello Mkyong", obj.getMessage("mkyong"));

	    }
}
