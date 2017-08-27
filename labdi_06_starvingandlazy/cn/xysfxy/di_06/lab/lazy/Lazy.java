/**
* Describe: ����ģʽ
* Keyword: 
* Hint: 
* Filename: Lazy.java
* Copyright 2017-04-13 By Gnosis. Allright reserved.
* Time: ����6:12:10
*/
package cn.xysfxy.di_06.lab.lazy;

public class Lazy {
	// 1.�������Ψһʵ��
	private static Lazy instance;

	// 2.��ֱֹ��ʵ��������
	private Lazy() {
	}
	// 3.�ṩһ����ȡʵ���ķ���
	public Lazy getInstance() {
		if (null == instance) {
			instance = new Lazy();
		}
		return instance;
	}
}
