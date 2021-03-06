package com.hong;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestHuman {
	@Resource(name="humanProxy")
	private Sleepable human;
	
	@Test
	public void testSleep()  {
		human.sleep();
	}
}