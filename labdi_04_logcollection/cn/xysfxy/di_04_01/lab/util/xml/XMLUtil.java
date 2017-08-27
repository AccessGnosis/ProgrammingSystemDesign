/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: XMLUtil.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ÏÂÎç8:29:22
*/
package cn.xysfxy.di_04_01.lab.util.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import cn.xysfxy.di_04_01.lab.factory.*;

public class XMLUtil {
	public static String getLogFactoryName() {
		String factoryName = null;
		try {
			DocumentBuilder db = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			// ±¨´í£ºjava.io.FileNotFoundException:
			// /Volumes/Datadisk/production/java/ProgrammingSystemDesign/xml/xmlinfo.xml
			Document document = db
					.parse(new File("labdi_04_logcollection/xml/xmlinfo.xml"));
			factoryName = document.getElementsByTagName("factory").item(0)
					.getFirstChild().getNodeValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factoryName;
	}
	public static String getLogFactoryPackageURL() {
		String url = null;
		try {
			url = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new File("labdi_04_logcollection/xml/xmlinfo.xml"))
					.getElementsByTagName("package").item(0).getFirstChild()
					.getNodeValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}
	public static String getLogFactoryFullName() {
		return getLogFactoryPackageURL() + "." + getLogFactoryName();
	}
	public static LogFactory getLogFactory() {
		LogFactory lf = null;
		try {
			lf = (LogFactory) Class.forName(getLogFactoryFullName())
					.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return lf;
	}
}
