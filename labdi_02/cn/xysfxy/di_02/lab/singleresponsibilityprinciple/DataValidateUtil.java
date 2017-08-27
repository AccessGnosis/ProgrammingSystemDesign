/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DataValidateUtil.java
* Copyright 2017-03-16 By Gnosis. Allright reserved.
* Time: 下午4:49:34
*/
package cn.xysfxy.di_02.lab.singleresponsibilityprinciple;

public class DataValidateUtil {
	public static boolean validate(String str) {
		boolean tag = true;
		String legalString = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890_";

		// 为null或位数不够
		if (str == null || str.length() < 6)
			tag = false;

		else {
			char firstChar = str.charAt(0);
			String number = "0123456789";
			// 判断是否已数字开头
			if (number.indexOf(firstChar) >= 0)
				tag = false;
			else {
				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (legalString.indexOf(c) < 0) {
						tag = false;
						break;
					}
				}
			}

		}
		return tag;
	}
}
