/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: XMLTest.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ8:33:38
*/
package cn.xysfxy.di_04_01.lab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.xysfxy.di_04_01.lab.util.xml.XMLUtil;

public class XMLTest {

	@Test
	public void test() {
		System.out.println(XMLUtil.getLogFactoryName());
		System.out.println(XMLUtil.getLogFactoryPackageURL());
		System.out.println(XMLUtil.getLogFactoryFullName());
		XMLUtil.getLogFactory();
	}

}
