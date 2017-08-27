/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DatabaseLog.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:37:43
*/
package cn.xysfxy.di_04_01.lab.product;

import cn.xysfxy.di_04_01.lab.dao.DatabaseLogDAO;
import cn.xysfxy.di_04_01.lab.domain.LogBean;

public class DatabaseLog implements Log {

	@Override
	public void output(LogBean logbean) {
		
	}

	@Override
	public void insert(LogBean logbean) {
		DatabaseLogDAO dld = new DatabaseLogDAO(logbean);
		dld.insertLog();
	}

	@Override
	public void delete(LogBean logbean) {
	}

	@Override
	public void update(LogBean logbean) {
	}


}
