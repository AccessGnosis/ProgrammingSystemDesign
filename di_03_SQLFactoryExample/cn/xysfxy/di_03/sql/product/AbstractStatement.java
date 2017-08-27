/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AbstractStatement.java
* Copyright 2017-03-29 By Gnosis. Allright reserved.
* Time: обнГ9:39:39
*/
package cn.xysfxy.di_03.sql.product;

import java.sql.Statement;

public interface AbstractStatement extends Statement {
	AbstractStatement createStatement();
}
