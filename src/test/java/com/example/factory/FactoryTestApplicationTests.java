package com.example.factory;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FactoryTestApplication.class)
@WebAppConfiguration
public class FactoryTestApplicationTests {
	
	@Autowired
	private Service service;

	@Test
	public void contextLoads() {
				
	}
	
	@Test
	public void testFactoryTypeOne(){
		String msg = service.getFactoryMessage("hello");
		Assert.assertThat(msg, Is.is("Echoing from type one...hello"));
	}
	
	@Test
	public void testFactoryTypeTwo(){
		String msg = service.getFactoryMessage("hello");
		Assert.assertThat(msg, Is.is("Echoing from type two...hello"));
	}

}
