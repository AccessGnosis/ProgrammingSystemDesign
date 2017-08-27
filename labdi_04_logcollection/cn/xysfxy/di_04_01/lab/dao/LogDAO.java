/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LogDAO.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: 下午7:45:44
*/
package cn.xysfxy.di_04_01.lab.dao;

public interface LogDAO {
	// 删除记录
	boolean deleteLog();
	// 插入记录
	boolean insertLog();
	// 修改记录
	boolean updateLog();
	// 查询记录
	boolean selectLog();
}
