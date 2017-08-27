/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AccountDAO.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:44:56
*/
package cn.xysfxy.task01.example.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.xysfxy.database.mysql.MysqlInfo;

public class AccountDAO {
	public boolean insert(String name, double balance) throws Exception {
		boolean tag = false;

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				MysqlInfo.getDatabaseURL("mydb"), MysqlInfo.getUserName(),
				MysqlInfo.getPassword());
		String sql = "insert tb_userinfo(name, balance) values(?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setDouble(2, balance);
		int i = pstmt.executeUpdate();

		if (i == 1) {
			tag = true;
		}

		pstmt.close();
		con.close();

		return tag;
	}
	public boolean transform(String from, String to, double money) throws Exception {
		boolean tag = false;
		Class.forName(MysqlInfo.getDriverName());
		Connection con = DriverManager.getConnection(
				MysqlInfo.getDatabaseURL("mydb"), MysqlInfo.getUserName(),
				MysqlInfo.getPassword());
		con.setAutoCommit(false);

		String sql = "update tb_userinfo set balance=balance-? where name=?";
//		System.out.println(sql);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setDouble(1, money);
		pstmt.setString(2, from);
		int i = pstmt.executeUpdate();

		String sql1 = "update tb_userinfo set balance=balance+? where name=?";
//		System.out.println(sql1);
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setDouble(1, money);
		pstmt1.setString(2, to);
		int i1 = pstmt1.executeUpdate();

		con.commit();

		if (i == 1 && i1 == 1) {
			tag = true;
		}

		pstmt.close();
		pstmt1.close();
		con.close();

		return tag;
	}
}
