/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TriangleDAO.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ4:52:54
*/
package cn.xysfxy.di_03.lab.dao;

public abstract class TriangleDAO implements ShapeDAO {
	protected double a, b, c;

	public TriangleDAO(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public TriangleDAO() {
	}

	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	public abstract double area();
}
