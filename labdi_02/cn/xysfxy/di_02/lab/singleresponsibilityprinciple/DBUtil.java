/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DBUtil.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: 下午4:46:35
*/
package cn.xysfxy.di_02.lab.singleresponsibilityprinciple;

import java.sql.*;

import cn.xysfxy.database.mysql.MysqlInfo;

public class DBUtil {
	public Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动程序不存在");

		}
		Connection con = DriverManager.getConnection(
				MysqlInfo.getDatabaseURL("db_lib02_loginform"), MysqlInfo.getUserName(),
				MysqlInfo.getPassword());
		return con;
	}
}
