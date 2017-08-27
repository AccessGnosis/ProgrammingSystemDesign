/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileLogFactory.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:52:48
*/
package cn.xysfxy.di_04_01.lab.factory;

import cn.xysfxy.di_04_01.lab.product.FileLog;
import cn.xysfxy.di_04_01.lab.product.Log;

public class FileLogFactory implements LogFactory {

	@Override
	public Log getLog() {
		return new FileLog();
	}

}
