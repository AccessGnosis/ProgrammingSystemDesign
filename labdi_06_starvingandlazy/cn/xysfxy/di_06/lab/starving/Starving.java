/**
* Describe: 饿汉模式
* Keyword: 
* Hint: 
* Filename: Starving.java
* Copyright 2017-04-13 By Gnosis. Allright reserved.
* Time: 下午6:07:56
*/
package cn.xysfxy.di_06.lab.starving;

public class Starving {
	// 1.创建类的唯一实例
	// 饿汉模式直接实例化类对象
	private static Starving instance = new Starving();

	// 2.将构造方法私有化，不允许外部直接创建
	private Starving() {
	}
	// 3.创建获取实例的方法
	// public Starving getInstance(){
	// return instance;
	// }
	public static Starving getInstance() {
		return instance;
	}
}
