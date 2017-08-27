/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LeaderOnly.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: обнГ11:47:59
*/
package cn.xysfxy.di_06.lab.multitonpattern;

public class LeaderOnly {
	private static LeaderOnly instance = null;

	private LeaderOnly() {
	}

	public static LeaderOnly getInstance() {
		if (null == instance) {
			instance = new LeaderOnly();
		}
		return instance;
	}
}
