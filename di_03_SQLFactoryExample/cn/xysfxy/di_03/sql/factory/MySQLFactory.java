/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MySQLFactory.java
* Copyright 2017-03-29 By Gnosis. Allright reserved.
* Time: ÏÂÎç9:58:30
*/
package cn.xysfxy.di_03.sql.factory;

import cn.xysfxy.di_03.sql.product.AbstractConnection;
import cn.xysfxy.di_03.sql.product.AbstractStatement;
import cn.xysfxy.di_03.sql.product.MySQLConnection;
import cn.xysfxy.di_03.sql.product.MySQLStatement;

public class MySQLFactory implements AbstractFactory {

	@Override
	public AbstractConnection createConnection(String db_url,
			String db_username, String db_password) {
		return new MySQLConnection(db_url, db_username, db_password);
	}

	@Override
	public AbstractStatement createStatement() {
		return new MySQLStatement();
	}

}
