/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: LeaderOnly.java
* Copyright 2017-04-26 By Gnosis. Allright reserved.
* Time: обнГ11:47:59
*/
package cn.xysfxy.di_06.lab.multitonpattern;

public class LeaderMuliti {
	private static final int length = 3;
	private static LeaderMuliti[] instance = new LeaderMuliti[length];

	private LeaderMuliti() {
	}

	public static LeaderMuliti getInstance() {
		for (int i = 0; i < length; ++i) {
			if (null == instance[i]) {
				instance[i] = new LeaderMuliti();
				return instance[i];
			}
		}
		return instance[(int) (Math.random() * length)];
	}
}
