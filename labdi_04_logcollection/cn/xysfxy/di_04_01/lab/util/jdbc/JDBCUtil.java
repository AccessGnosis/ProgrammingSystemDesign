/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: JDBCUtil.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: ÏÂÎç8:03:39
*/
package cn.xysfxy.di_04_01.lab.util.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.xysfxy.database.mysql.MysqlInfo;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(MysqlInfo.getDatabaseURL("mydb"),
					MysqlInfo.getUserName(), MysqlInfo.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void close(Connection con, PreparedStatement ps) {
		try {
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection con, PreparedStatement ps,
			ResultSet rs) {
		try {
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
