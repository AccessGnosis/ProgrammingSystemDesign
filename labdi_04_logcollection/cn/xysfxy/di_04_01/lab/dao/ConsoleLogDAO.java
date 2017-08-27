/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ConsoleLogDAO.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ����9:33:20
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
		System.out.println("������ţ�" + this.id + ", �����û���" + this.username
				+ ", ����ʱ�䣺" + this.time + ", �������ݣ�" + this.operation);
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
