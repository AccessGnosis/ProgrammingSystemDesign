/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InfoUtil.java
* Copyright 2017-03-29 By Gnosis. Allright reserved.
* Time: ÏÂÎç10:04:20
*/
package cn.xysfxy.di_03.sql.ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cn.xysfxy.di_03.sql.factory.AbstractFactory;
import cn.xysfxy.di_03.sql.product.AbstractStatement;

public class InfoUtil {
	public static AbstractFactory createFactory() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		AbstractFactory af = null;
		
		InputStream input = InfoUtil.class.getClassLoader().getResourceAsStream("cn/xysfxy/di_03/sql/ui/sqlinfo.properties");
		Properties p = new Properties();
		p.load(input);
		
		af = (AbstractFactory) Class.forName(p.getProperty("sql_software")).newInstance();
		
		return af;
	}
	public static AbstractStatement createStatement() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		AbstractStatement as = null;
		
		InputStream input = InfoUtil.class.getClassLoader().getResourceAsStream("cn/xysfxy/di_03/sql/ui/sqlinfo.properties");
		Properties p = new Properties();
		p.load(input);
		
		as = (AbstractStatement) Class.forName(p.getProperty("sql_statement")).newInstance();
		
		return as;
	}
}
