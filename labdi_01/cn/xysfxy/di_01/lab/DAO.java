/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DAO.java
* Copyright 2017-03-09 By Gnosis. Allright reserved.
* Time: ����4:48:43
*/
package cn.xysfxy.di_01.lab;

import java.sql.*;

/**
 * ���ݿ������DAO��ʵ����ɾ�Ĳ鷽��
 * @author gnosis
 *
 */
public class DAO {
	public final static String URL = "jdbc:mysql://localhost:3306/db_xinguan?characterEncoding=utf8&useSSL=true";
	public final static String USERNAME = "root";
	public final static String PASSWORD = "pHG7MBULZrOO";

	public static int insert(String sname, int sage, String smajor)
			throws SQLException {
		// ����JDBC����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// �������ݿ�����
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// �������ݿ����
		String sql = "insert tb_studentinfo(sname, sage, smajor) values ('"
				+ sname + "', " + sage + ", '" + smajor + "')";
		int count = stmt.executeUpdate(sql);

		if (count < 1) {
			System.out.println("���ݲ���ʧ��");
			stmt.close();
			con.close();

			return 0;
		}
		stmt.close();
		con.close();

		return count;
	}
	public static int delete(int sid) throws SQLException {
		// ����JDBC����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// �������ݿ�����
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// �������ݿ����
		String sql = "delete from tb_studentinfo where sid=" + sid;
		int count = stmt.executeUpdate(sql);

		if (count < 1) {
			System.out.println("����ɾ��ʧ��");
			stmt.close();
			con.close();

			return 0;
		}
		stmt.close();
		con.close();

		return count;
	}
	public static int update() throws SQLException {
		// ����JDBC����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// �������ݿ�����
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// �������ݿ����
		String sql = "update tb_studentinfo set sage=sage+1";
		int count = stmt.executeUpdate(sql);

		if (count < 1) {
			System.out.println("���ݸ���ʧ��");
			stmt.close();
			con.close();

			return 0;
		}
		stmt.close();
		con.close();

		return count;
	}
	public static boolean select() throws SQLException {
		// ����JDBC����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// �������ݿ�����
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement stmt = con.createStatement();

		// �������ݿ����
		String sql = "select * from tb_studentinfo";
		ResultSet rs = stmt.executeQuery(sql);
		rs.afterLast();
		if (rs.previous()) {
			do {
				System.out.print("ѧ�ţ�" + rs.getInt("sid") + "��");
				System.out.print("������" + rs.getString("sname") + "��");
				System.out.print("���䣺" + rs.getInt("sage") + "��");
				System.out.println("רҵ��" + rs.getString("smajor"));
			} while (rs.previous());
			rs.close();
			stmt.close();
			con.close();

			return true;
		} else {
			rs.close();
			stmt.close();
			con.close();
			System.out.println("����û������");

			return false;
		}
	}
}
