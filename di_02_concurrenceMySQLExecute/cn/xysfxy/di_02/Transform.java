/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DAO.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: ÉÏÎç9:01:22
*/
package cn.xysfxy.di_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Transform {
	public static void transform() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb?characterEncoding=utf-8&&useSSL=true", "root", "pHG7MBULZrOO");
		con.setAutoCommit(false);
		
		String sql = "update t_account set balance=balance-1000 where name=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "lisi");
		int i = pstmt.executeUpdate();
		
		String sql1 = "update t_account set balance=balance+1000 where name=?";
		PreparedStatement pstmt1 = con.prepareStatement(sql1);
		pstmt1.setString(1, "zhangsan");
		int i1 = pstmt1.executeUpdate();
		
		con.commit();
		
		pstmt.close();
		pstmt1.close();
		con.close();
	}
}
