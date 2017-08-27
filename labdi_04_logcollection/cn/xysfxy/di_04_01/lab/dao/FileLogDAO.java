/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: FileLogDAO.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: 下午9:04:11
*/
package cn.xysfxy.di_04_01.lab.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import cn.xysfxy.di_04_01.lab.domain.LogBean;

public class FileLogDAO implements LogDAO {
	private int id;
	private String time;
	private String operation;
	private String username;

	public FileLogDAO() {
	}
	public FileLogDAO(LogBean logbean) {
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
		ObjectOutputStream oos = null;

		try {
			File file = new File("filelog.txt");
			OutputStream output = new FileOutputStream(file);
			oos = new ObjectOutputStream(output);
			oos.writeObject("操作序号：" + this.id + ", 操作用户：" + this.username
					+ ", 操作时间：" + this.time + ", 操作内容：" + this.operation);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return false;
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
