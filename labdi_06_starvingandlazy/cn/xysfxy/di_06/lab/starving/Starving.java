/**
* Describe: ����ģʽ
* Keyword: 
* Hint: 
* Filename: Starving.java
* Copyright 2017-04-13 By Gnosis. Allright reserved.
* Time: ����6:07:56
*/
package cn.xysfxy.di_06.lab.starving;

public class Starving {
	// 1.�������Ψһʵ��
	// ����ģʽֱ��ʵ���������
	private static Starving instance = new Starving();

	// 2.�����췽��˽�л����������ⲿֱ�Ӵ���
	private Starving() {
	}
	// 3.������ȡʵ���ķ���
	// public Starving getInstance(){
	// return instance;
	// }
	public static Starving getInstance() {
		return instance;
	}
}
