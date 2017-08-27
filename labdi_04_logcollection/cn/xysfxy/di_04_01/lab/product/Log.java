/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Log.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ7:36:28
*/
package cn.xysfxy.di_04_01.lab.product;

import cn.xysfxy.di_04_01.lab.domain.LogBean;

public interface Log {
	void output(LogBean logbean);
	void insert(LogBean logbean);
	void delete(LogBean logbean);
	void update(LogBean logbean);
}
