/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileLog.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:39:10
*/
package cn.xysfxy.di_04_01.lab.product;

import cn.xysfxy.di_04_01.lab.dao.FileLogDAO;
import cn.xysfxy.di_04_01.lab.domain.LogBean;

public class FileLog implements Log {

	@Override
	public void output(LogBean logbean) {
	}

	@Override
	public void insert(LogBean logbean) {
		FileLogDAO fld = new FileLogDAO(logbean);
		fld.insertLog();
	}

	@Override
	public void delete(LogBean logbean) {
	}

	@Override
	public void update(LogBean logbean) {
	}

}
