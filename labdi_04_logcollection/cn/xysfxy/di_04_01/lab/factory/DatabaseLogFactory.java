/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DatabaseLogFactory.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:52:15
*/
package cn.xysfxy.di_04_01.lab.factory;

import cn.xysfxy.di_04_01.lab.product.DatabaseLog;
import cn.xysfxy.di_04_01.lab.product.Log;

public class DatabaseLogFactory implements LogFactory {

	@Override
	public Log getLog() {
		return new DatabaseLog();
	}

}
