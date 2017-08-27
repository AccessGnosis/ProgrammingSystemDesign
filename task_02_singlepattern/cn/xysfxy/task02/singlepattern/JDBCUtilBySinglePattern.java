/**
* Describe: 第二次作业——通过单例模式实现JDBCUtil功能
* 		使用单例模式可以保证在堆内存中有且仅有一个对象被创建，而在栈内存中可以创建若干个对象名，所指向的实际上是同一个对象，实现同样的功能。
* 		主要优点：确保所以对象访问唯一实例；控制实例生成个数，减少系统开销；避免造成多个对象造成线程冲突。
* Keyword: 单例模式，JDBC
* Hint: 
* Filename: JDBCUtilBySinglePattern.java
* Copyright 2017-04-13 By Gnosis. Allright reserved.
* Time: 上午12:26:32
*/
package cn.xysfxy.task02.singlepattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.xysfxy.database.mysql.MysqlInfo;

public class JDBCUtilBySinglePattern {
	// 创建静态实例
	private static JDBCUtilBySinglePattern instance = null;

	// 通过private管理权限防止对本类进行直接new实例化
	private JDBCUtilBySinglePattern() {
	}

	// 通过静态块，加载MySQL驱动
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 通过唯一的getInstance()方法获得JDBCUtilBySinglePattern实例
	public static JDBCUtilBySinglePattern getInstance() {
		if (null == instance) {
			instance = new JDBCUtilBySinglePattern();
		}
		return instance;
	}
	// 下面实现getConnection()和close()方法
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(MysqlInfo.getDatabaseURL("mydb"),
					MysqlInfo.getUserName(), MysqlInfo.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close(Connection con, PreparedStatement pst) {
		try {
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void close(Connection con, PreparedStatement pst, ResultSet rs) {
		try {
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
