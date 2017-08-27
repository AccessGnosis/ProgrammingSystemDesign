/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DatabaseConfigTest.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: ионГ8:30:13
*/
package cn.xysfxy.database;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.xysfxy.database.mysql.MysqlInfo;

public class DatabaseConfigTest {

	@Test
	public void testMySQL() throws Exception {
		MysqlInfo.getDriverName();
	}

}
