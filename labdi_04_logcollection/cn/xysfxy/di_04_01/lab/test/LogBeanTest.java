/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DaoTest.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ����7:32:21
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
		lb.setOperation("ɾ��");
		lb.setTime("2017��04��04��");
		lb.setUser("Gnosis");
		System.out.println(lb);
	}

}
