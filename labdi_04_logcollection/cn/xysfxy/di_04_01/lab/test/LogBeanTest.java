/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DaoTest.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: 下午7:32:21
*/
package cn.xysfxy.di_04_01.lab.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import cn.xysfxy.di_04_01.lab.domain.LogBean;

public class LogBeanTest {

	@Test
	public void test() {
		LogBean lb = new LogBean();
		lb.setId(10);
		lb.setOperation("删除");
		lb.setTime("2017年04月04日");
		lb.setUser("Gnosis");
		System.out.println(lb);
	}

}
