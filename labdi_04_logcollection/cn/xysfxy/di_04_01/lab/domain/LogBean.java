/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LogBean.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: 下午7:29:16
*/
package cn.xysfxy.di_04_01.lab.domain;

import java.io.Serializable;

/**
 * 记录的基本属性和setter、getter操作
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
		return "操作序号：" + this.id + ", 操作用户：" + this.user + ", 操作时间：" + this.time
				+ ", 操作内容：" + this.operation;
	}
}
