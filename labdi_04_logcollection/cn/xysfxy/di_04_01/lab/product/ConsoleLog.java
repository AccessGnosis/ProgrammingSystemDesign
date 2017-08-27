/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ConsoleLog.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:38:32
*/
package cn.xysfxy.di_04_01.lab.product;

import cn.xysfxy.di_04_01.lab.dao.ConsoleLogDAO;
import cn.xysfxy.di_04_01.lab.domain.LogBean;

public class ConsoleLog implements Log {

	@Override
	public void output(LogBean logbean) {
	}

	@Override
	public void insert(LogBean logbean) {
		ConsoleLogDAO cld = new ConsoleLogDAO(logbean);
		cld.insertLog();
	}

	@Override
	public void delete(LogBean logbean) {
	}

	@Override
	public void update(LogBean logbean) {
	}

}
