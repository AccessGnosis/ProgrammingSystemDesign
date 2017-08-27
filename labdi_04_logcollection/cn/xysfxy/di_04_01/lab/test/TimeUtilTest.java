/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TimeUtilTest.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ8:06:20
*/
package cn.xysfxy.di_04_01.lab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.xysfxy.di_04_01.lab.util.time.TimeUtil;

public class TimeUtilTest {

	@Test
	public void test() {
		String time = TimeUtil.getTime();
		System.out.println(time);
	}

}
