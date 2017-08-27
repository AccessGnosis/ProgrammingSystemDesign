/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Triangle.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ5:02:25
*/
package cn.xysfxy.di_03.lab.daoimp;

import cn.xysfxy.di_03.lab.dao.TriangleDAO;

public class Triangle extends TriangleDAO {
	public Triangle() {
	}
	public Triangle(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public double gride() {
		return (a + b + c);
	}

	@Override
	public double area() {
		double p = (1.0 / 2) * (a + b + c);
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}

}
