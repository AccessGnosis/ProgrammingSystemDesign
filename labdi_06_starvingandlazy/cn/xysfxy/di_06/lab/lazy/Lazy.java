/**
* Describe: 懒汉模式
* Keyword: 
* Hint: 
* Filename: Lazy.java
* Copyright 2017-04-13 By Gnosis. Allright reserved.
* Time: 下午6:12:10
*/
package cn.xysfxy.di_06.lab.lazy;

public class Lazy {
	// 1.声明类的唯一实例
	private static Lazy instance;

	// 2.防止直接实例化本类
	private Lazy() {
	}
	// 3.提供一个获取实例的方法
	public Lazy getInstance() {
		if (null == instance) {
			instance = new Lazy();
		}
		return instance;
	}
}
