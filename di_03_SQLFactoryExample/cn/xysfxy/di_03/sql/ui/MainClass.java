/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-03-29 By Gnosis. Allright reserved.
* Time: ÏÂÎç9:42:03
*/
package cn.xysfxy.di_03.sql.ui;

import java.io.IOException;
import java.sql.SQLException;

import cn.xysfxy.database.mysql.MysqlInfo;
import cn.xysfxy.di_03.sql.factory.AbstractFactory;
import cn.xysfxy.di_03.sql.factory.MySQLFactory;
import cn.xysfxy.di_03.sql.product.AbstractConnection;
import cn.xysfxy.di_03.sql.product.AbstractStatement;
import cn.xysfxy.di_03.sql.product.MySQLConnection;
import cn.xysfxy.di_03.sql.product.MySQLStatement;

public class MainClass {

	public static void main(String[] args) throws SQLException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		String db_url = MysqlInfo.getDatabaseURL("mydb");
		String db_username = MysqlInfo.getUserName();
		String db_password = MysqlInfo.getPassword();
		
		AbstractFactory factory = InfoUtil.createFactory();
		AbstractConnection con = factory.createConnection(db_url, db_username, db_password);
		
		String sql = "insert into t_student(name, age) values(lisi, 21)";
		
		AbstractStatement stmt = InfoUtil.createStatement();
		stmt.executeUpdate(sql);
		
		stmt.close();
		con.close();
	}

}
