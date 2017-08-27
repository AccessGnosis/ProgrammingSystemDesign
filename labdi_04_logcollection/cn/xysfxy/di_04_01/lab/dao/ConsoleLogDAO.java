/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ConsoleLogDAO.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: 下午9:33:20
*/
package cn.xysfxy.di_04_01.lab.dao;

import cn.xysfxy.di_04_01.lab.domain.LogBean;

public class ConsoleLogDAO implements LogDAO {
	private int id;
	private String time;
	private String operation;
	private String username;

	public ConsoleLogDAO() {
	}
	public ConsoleLogDAO(LogBean logbean) {
		this.id = logbean.getId();
		this.time = logbean.getTime();
		this.operation = logbean.getOperation();
		this.username = logbean.getUser();
	}
	@Override
	public boolean deleteLog() {
		return false;
	}

	@Override
	public boolean insertLog() {
		System.out.println("操作序号：" + this.id + ", 操作用户：" + this.username
				+ ", 操作时间：" + this.time + ", 操作内容：" + this.operation);
		return true;
	}

	@Override
	public boolean updateLog() {
		return false;
	}

	@Override
	public boolean selectLog() {
		return false;
	}

}
