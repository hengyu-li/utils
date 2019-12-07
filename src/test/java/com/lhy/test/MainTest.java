package com.lhy.test;

import org.junit.Test;

import com.lhy.utils.StringUtils;

public class MainTest {
	
	@Test
	public void testIsNumber() {
		boolean b=StringUtils.isNumber("123456.222");
		System.out.println(b);
	}
	
	@Test
	public void testPhoneNumber() {
		boolean b=StringUtils.isPhoneNumber("18262856519");
		System.out.println(b);
	}
	
	@Test
	public void testEmile() {
		boolean b=StringUtils.isEmail("3144046526@qq.com");
		System.out.println(b);
	}

	@Test
	public void  testRandomChineseString() {
		for(int i = 0;i<10;i++) {
			String string = StringUtils.randomChineseString();
		}
	}
}
