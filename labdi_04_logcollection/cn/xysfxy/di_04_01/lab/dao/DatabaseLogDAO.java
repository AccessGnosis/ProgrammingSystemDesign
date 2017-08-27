/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DatabaseLogDAO.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ÏÂÎç7:40:21
*/
package cn.xysfxy.di_04_01.lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.xysfxy.di_04_01.lab.domain.LogBean;
import cn.xysfxy.di_04_01.lab.util.jdbc.JDBCUtil;

public class DatabaseLogDAO implements LogDAO {
	private int id;
	private String time;
	private String operation;
	private String username;

	public DatabaseLogDAO() {
	}
	public DatabaseLogDAO(LogBean logbean) {
		this.id = logbean.getId();
		this.time = logbean.getTime();
		this.operation = logbean.getOperation();
		this.username = logbean.getUser();
	}
	@Override
	public boolean deleteLog() {
		boolean tag = false;
		return tag;
	}
	@Override
	public boolean insertLog() {
		boolean tag = false;

		Connection con = null;
		try {
			con = JDBCUtil.getConnection();
			String sql = "insert into tb_lab04(user, time, operation) values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, this.username);
			ps.setString(2, this.time);
			ps.setString(3, this.operation);
			if (1 == ps.executeUpdate()) {
				tag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tag;
	}
	@Override
	public boolean updateLog() {
		boolean tag = false;
		return tag;
	}
	@Override
	public boolean selectLog() {
		boolean tag = false;
		return tag;
	}

}
