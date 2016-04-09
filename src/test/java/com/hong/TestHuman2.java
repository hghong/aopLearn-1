package com.hong;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext2.xml")
public class TestHuman2 {
	@Resource
	private Sleepable human;
	
	@Test
	public void testSleep()  {
		human.sleep();
	}
}