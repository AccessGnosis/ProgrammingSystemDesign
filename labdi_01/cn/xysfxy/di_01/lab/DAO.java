/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DAO.java
* Copyright 2017-03-09 By Gnosis. Allright reserved.
* Time: 下午4:48:43
*/
package cn.xysfxy.di_01.lab;

import java.sql.*;

/**
 * 数据库操作类DAO，实现增删改查方法
 * @author gnosis
 *
 */
public class DAO {
	public final static String URL = "jdbc:mysql://localhost:3306/db_xinguan?characterEncoding=utf8&useSSL=true";
	public final static String USERNAME = "root";
	public final static String PASSWORD = "pHG7MBULZrOO";

	public static int insert(String sname, int sage, String smajor)
			throws SQLException {
		// 加载JDBC驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 创建数据库连接
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// 定义数据库语句
		String sql = "insert tb_studentinfo(sname, sage, smajor) values ('"
				+ sname + "', " + sage + ", '" + smajor + "')";
		int count = stmt.executeUpdate(sql);

		if (count < 1) {
			System.out.println("数据插入失败");
			stmt.close();
			con.close();

			return 0;
		}
		stmt.close();
		con.close();

		return count;
	}
	public static int delete(int sid) throws SQLException {
		// 加载JDBC驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 创建数据库连接
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// 定义数据库语句
		String sql = "delete from tb_studentinfo where sid=" + sid;
		int count = stmt.executeUpdate(sql);

		if (count < 1) {
			System.out.println("数据删除失败");
			stmt.close();
			con.close();

			return 0;
		}
		stmt.close();
		con.close();

		return count;
	}
	public static int update() throws SQLException {
		// 加载JDBC驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 创建数据库连接
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// 定义数据库语句
		String sql = "update tb_studentinfo set sage=sage+1";
		int count = stmt.executeUpdate(sql);

		if (count < 1) {
			System.out.println("数据更新失败");
			stmt.close();
			con.close();

			return 0;
		}
		stmt.close();
		con.close();

		return count;
	}
	public static boolean select() throws SQLException {
		// 加载JDBC驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 创建数据库连接
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// 定义数据库语句
		String sql = "select * from tb_studentinfo";
		ResultSet rs = stmt.executeQuery(sql);
		rs.afterLast();
		if (rs.previous()) {
			do {
				System.out.print("学号：" + rs.getInt("sid") + "；");
				System.out.print("姓名：" + rs.getString("sname") + "；");
				System.out.print("年龄：" + rs.getInt("sage") + "；");
				System.out.println("专业：" + rs.getString("smajor"));
			} while (rs.previous());
			rs.close();
			stmt.close();
			con.close();

			return true;
		} else {
			rs.close();
			stmt.close();
			con.close();
			System.out.println("表中没有数据");

			return false;
		}
	}
}
