/**
* Describe: Connect to MySQL Database
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-03-06 By Gnosis. Allright reserved.
* Time: ����11:33:46
*/
package cn.xysfxy.di_01;

import java.sql.*;

import cn.xysfxy.database.mysql.MysqlInfo;

public class MainClass {

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			String name = "��" + (i + 1);
			DAO.insert(name, 20 + i);
		}
		DAO.select();
		// DAO.delete();
		// DAO.select();
	}

}

/**
 * ���ݿ������
 * @author gnosis
 *
 */
class DAO {
	static int insert(String sname, int sage) {
		// �������ݿ�
		try {
			Class.forName(MysqlInfo.getDriverName());
			// System.out.println("���ݿ��������سɹ�");
		} catch (ClassNotFoundException e) {
			// System.out.println("���ݿ���������ʧ��");
			e.printStackTrace();
		}
		// �������ݿ�
		try {
			Connection conn = DriverManager.getConnection(
					MysqlInfo.getDatabaseURL("db_test_connection"),
					MysqlInfo.getUserName(), MysqlInfo.getPassword());
			// System.out.println("���ݿ����ӳɹ�");
			Statement stmt = conn.createStatement();
			// System.out.println("���ݿ�����״̬���");
			String sql = "insert tb_stu(sname, sage) values('" + sname + "', "
					+ sage + ")";
			int count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("���ݲ���ɹ�");
				System.out.println(count + "����Ӱ��");
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
		// �������ݿ�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("���ݿ��������سɹ�");
		} catch (ClassNotFoundException e) {
			// System.out.println("���ݿ���������ʧ��");
			e.printStackTrace();
		}
		// �������ݿ�
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_test_connection?characterEncoding=utf8&useSSL=true",
					"root", "pHG7MBULZrOO");
			// System.out.println("���ݿ����ӳɹ�");
			Statement stmt = conn.createStatement();
			// System.out.println("���ݿ�����״̬���");
			String sql = "delete from tb_stu where 1=1";
			int count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("��������ճɹ�");
				System.out.println(count + "����Ӱ��");
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
		// �������ݿ�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("���ݿ��������سɹ�");
		} catch (ClassNotFoundException e) {
			// System.out.println("���ݿ���������ʧ��");
			e.printStackTrace();
		}
		// �������ݿ�
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_test_connection?characterEncoding=utf8&useSSL=true",
					"root", "pHG7MBULZrOO");
			// System.out.println("���ݿ����ӳɹ�");
			Statement stmt = conn.createStatement();
			// System.out.println("���ݿ�����״̬���");
			String sql = "select * from tb_stu";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				do {
					System.out.println("ѧ�ţ�" + rs.getInt("sid") + " ��������"
							+ rs.getString("sname") + " �����䣺"
							+ rs.getInt("sage"));
				} while (rs.next());
			} else {
				System.out.println("����û������");
			}

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
}