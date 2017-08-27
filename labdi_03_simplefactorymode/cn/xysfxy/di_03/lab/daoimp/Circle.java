/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Circle.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ4:58:34
*/
package cn.xysfxy.di_03.lab.daoimp;

import cn.xysfxy.di_03.lab.dao.CircleDAO;

public class Circle extends CircleDAO {

	public Circle() {
	}
	public Circle(double r) {
		super(r);
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}

	@Override
	public double gride() {
		return 2 * Math.PI * r;
	}

}
