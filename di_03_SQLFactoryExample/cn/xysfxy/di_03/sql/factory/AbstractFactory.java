/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AbstractFactory.java
* Copyright 2017-03-29 By Gnosis. Allright reserved.
* Time: обнГ9:55:48
*/
package cn.xysfxy.di_03.sql.factory;

import cn.xysfxy.di_03.sql.product.AbstractConnection;
import cn.xysfxy.di_03.sql.product.AbstractStatement;

public interface AbstractFactory {
	AbstractConnection createConnection(String db_url, String db_username, String db_password);
	AbstractStatement createStatement();
}
