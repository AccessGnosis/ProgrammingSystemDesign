/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AbstractConnection.java
* Copyright 2017-03-29 By Gnosis. Allright reserved.
* Time: обнГ9:37:59
*/
package cn.xysfxy.di_03.sql.product;

import java.sql.Connection;

public interface AbstractConnection extends Connection{
	AbstractConnection createConnection();
}
