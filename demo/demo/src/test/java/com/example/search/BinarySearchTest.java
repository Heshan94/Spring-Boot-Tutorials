package com.example.search;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.DemoApplication;

@ContextConfiguration(classes = DemoApplication.class)
@RunWith(SpringRunner.class)

public class BinarySearchTest {
	@Autowired
	BinarySearch bs;
	
	@Test
	public void test() {
		int result = bs.search(new int[] {});
		assertEquals(3, result);
	}

}
