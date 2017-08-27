/**
* Describe: �ڶ�����ҵ����ͨ������ģʽʵ��JDBCUtil����
* 		ʹ�õ���ģʽ���Ա�֤�ڶ��ڴ������ҽ���һ�����󱻴���������ջ�ڴ��п��Դ������ɸ�����������ָ���ʵ������ͬһ������ʵ��ͬ���Ĺ��ܡ�
* 		��Ҫ�ŵ㣺ȷ�����Զ������Ψһʵ��������ʵ�����ɸ���������ϵͳ������������ɶ����������̳߳�ͻ��
* Keyword: ����ģʽ��JDBC
* Hint: 
* Filename: JDBCUtilBySinglePattern.java
* Copyright 2017-04-13 By Gnosis. Allright reserved.
* Time: ����12:26:32
*/
package cn.xysfxy.task02.singlepattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.xysfxy.database.mysql.MysqlInfo;

public class JDBCUtilBySinglePattern {
	// ������̬ʵ��
	private static JDBCUtilBySinglePattern instance = null;

	// ͨ��private����Ȩ�޷�ֹ�Ա������ֱ��newʵ����
	private JDBCUtilBySinglePattern() {
	}

	// ͨ����̬�飬����MySQL����
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ͨ��Ψһ��getInstance()�������JDBCUtilBySinglePatternʵ��
	public static JDBCUtilBySinglePattern getInstance() {
		if (null == instance) {
			instance = new JDBCUtilBySinglePattern();
		}
		return instance;
	}
	// ����ʵ��getConnection()��close()����
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
