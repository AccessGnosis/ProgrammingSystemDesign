/**
* Describe: Connect to MySQL Database
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-03-06 By Gnosis. Allright reserved.
* Time: 下午11:33:46
*/
package cn.xysfxy.di_01;

import java.sql.*;

import cn.xysfxy.database.mysql.MysqlInfo;

public class MainClass {

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			String name = "张" + (i + 1);
			DAO.insert(name, 20 + i);
		}
		DAO.select();
		// DAO.delete();
		// DAO.select();
	}

}

/**
 * 数据库操作类
 * @author gnosis
 *
 */
class DAO {
	static int insert(String sname, int sage) {
		// 加载数据库
		try {
			Class.forName(MysqlInfo.getDriverName());
			// System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			// System.out.println("数据库驱动加载失败");
			e.printStackTrace();
		}
		// 连接数据库
		try {
			Connection conn = DriverManager.getConnection(
					MysqlInfo.getDatabaseURL("db_test_connection"),
					MysqlInfo.getUserName(), MysqlInfo.getPassword());
			// System.out.println("数据库连接成功");
			Statement stmt = conn.createStatement();
			// System.out.println("数据库连接状态完成");
			String sql = "insert tb_stu(sname, sage) values('" + sname + "', "
					+ sage + ")";
			int count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("数据插入成功");
				System.out.println(count + "行受影响");
			}

			stmt.close();
			conn.close();

			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
	static int delete() {
		// 加载数据库
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			// System.out.println("数据库驱动加载失败");
			e.printStackTrace();
		}
		// 连接数据库
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_test_connection?characterEncoding=utf8&useSSL=true",
					"root", "pHG7MBULZrOO");
			// System.out.println("数据库连接成功");
			Statement stmt = conn.createStatement();
			// System.out.println("数据库连接状态完成");
			String sql = "delete from tb_stu where 1=1";
			int count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("表数据清空成功");
				System.out.println(count + "行受影响");
			}

			stmt.close();
			conn.close();

			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
	static int select() {
		// 加载数据库
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("数据库驱动加载成功");
		} catch (ClassNotFoundException e) {
			// System.out.println("数据库驱动加载失败");
			e.printStackTrace();
		}
		// 连接数据库
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_test_connection?characterEncoding=utf8&useSSL=true",
					"root", "pHG7MBULZrOO");
			// System.out.println("数据库连接成功");
			Statement stmt = conn.createStatement();
			// System.out.println("数据库连接状态完成");
			String sql = "select * from tb_stu";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				do {
					System.out.println("学号：" + rs.getInt("sid") + " ；姓名："
							+ rs.getString("sname") + " ；年龄："
							+ rs.getInt("sage"));
				} while (rs.next());
			} else {
				System.out.println("表中没有数据");
			}

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
}