/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-03-09 By Gnosis. Allright reserved.
* Time: ����4:48:52
*/
package cn.xysfxy.di_01.lab;

import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		try {
//			DAO.select();
			DAO.insert("����", 20, "�Ź�");
			DAO.select();
			DAO.delete(5);
			DAO.select();
			DAO.update();
			DAO.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
