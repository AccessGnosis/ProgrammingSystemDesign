/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ConsoleLogFactory.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:50:36
*/
package cn.xysfxy.di_04_01.lab.factory;

import cn.xysfxy.di_04_01.lab.product.ConsoleLog;
import cn.xysfxy.di_04_01.lab.product.Log;

public class ConsoleLogFactory implements LogFactory {

	@Override
	public Log getLog() {
		return new ConsoleLog();
	}

}
