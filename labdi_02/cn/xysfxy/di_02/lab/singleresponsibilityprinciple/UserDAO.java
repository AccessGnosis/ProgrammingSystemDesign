/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: UserDAO.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: ÏÂÎç4:46:29
*/
package cn.xysfxy.di_02.lab.singleresponsibilityprinciple;

import java.sql.*;

public class UserDAO {
	public boolean findUser(String userName, String userPassword) {
		boolean tag = false;
		DBUtil dbu = new DBUtil();
		try {
			Connection con = dbu.getConnection();

			Statement stmt = con.createStatement();
			String sql = "select * from tb_account where username='" + userName
					+ "' and password='" + userPassword + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs != null)
				tag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tag;
	}
}
