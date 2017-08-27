/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TimeUtil.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ8:03:19
*/
package cn.xysfxy.di_04_01.lab.util.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	public static String getTime(){
		String time = null;
		
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		time = simpledateformat.format(new Date());
		
		return time;
	}
}
