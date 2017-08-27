/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: XMLUtil.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:48:41
*/
package cn.xysfxy.di_05.lab.util.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import cn.xysfxy.di_05.lab.factory.ComputerBuilderFactory;

public class XMLUtil {
	public static ComputerBuilderFactory getBean() {
		ComputerBuilderFactory comBuilder = null;

		try {
			Document document = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse(new File("labdi_05_builder/xml/xmlinfo.xml"));
			Node node = document.getElementsByTagName("builder").item(0)
					.getFirstChild();
			String Name = node.getNodeValue();
			String packageName = document.getElementsByTagName("package")
					.item(0).getFirstChild().getNodeValue();
			String builderName = packageName + "." + Name;

			comBuilder = (ComputerBuilderFactory) Class.forName(builderName)
					.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return comBuilder;
	}
}
