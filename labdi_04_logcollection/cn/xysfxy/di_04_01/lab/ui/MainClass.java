/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: 上午9:35:20
*/
package cn.xysfxy.di_04_01.lab.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import cn.xysfxy.di_04_01.lab.domain.LogBean;
import cn.xysfxy.di_04_01.lab.factory.FileLogFactory;
import cn.xysfxy.di_04_01.lab.factory.LogFactory;
import cn.xysfxy.di_04_01.lab.product.Log;
import cn.xysfxy.di_04_01.lab.util.time.TimeUtil;
import cn.xysfxy.di_04_01.lab.util.xml.XMLUtil;

public class MainClass {

	public static void main(String[] args) {
		LogFactory logfactory = XMLUtil.getLogFactory();
		Log log = logfactory.getLog();
		LogBean logbean = new LogBean();
		logbean.setId(1410074102);
		logbean.setTime(TimeUtil.getTime());
		logbean.setOperation("增加记录");
		logbean.setUser("Gnosis");
		log.insert(logbean);

		// 判断logfactory对象属于FileLogFactory，执行反序列化程序
		if (logfactory instanceof FileLogFactory) {
			ObjectInputStream ois = null;
			File file = new File("filelog.txt");
			try {
				InputStream input = new FileInputStream(file);
				ois = new ObjectInputStream(input);
				// ois.readObject()方法直接返回文件中的内容，无法强转为LogBean
				System.out.println((String) ois.readObject());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
