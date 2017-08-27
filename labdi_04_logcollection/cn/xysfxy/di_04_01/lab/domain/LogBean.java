/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LogBean.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ����7:29:16
*/
package cn.xysfxy.di_04_01.lab.domain;

import java.io.Serializable;

/**
 * ��¼�Ļ������Ժ�setter��getter����
 * @author gnosis
 * 
 */
public class LogBean implements Serializable {
	private int id;
	private String user;
	private String time;
	private String operation;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "������ţ�" + this.id + ", �����û���" + this.user + ", ����ʱ�䣺" + this.time
				+ ", �������ݣ�" + this.operation;
	}
}
