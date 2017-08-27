/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: XMLInfo.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ÏÂÎç9:59:33
*/
package cn.xysfxy.di_04_02.lab.util.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import cn.xysfxy.di_04_02.lab.factory.ComputerFactory;

public class XMLInfo {
	public static ComputerFactory getFactory() {
		ComputerFactory cf = null;
		try {
			String factoryName = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse(new File(
							"labdi_04_02_produce_computer_p103t2/xml/xmlinfo.xml"))
					.getElementsByTagName("type").item(0).getFirstChild()
					.getNodeValue();
			String packageurl = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse(new File(
							"labdi_04_02_produce_computer_p103t2/xml/xmlinfo.xml"))
					.getElementsByTagName("package").item(0).getFirstChild()
					.getNodeValue();
			String fullFactoryName = packageurl + "." + factoryName;
			cf = (ComputerFactory) Class.forName(fullFactoryName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cf;
	}
}
