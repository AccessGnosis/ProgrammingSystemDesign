/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SquareDAO.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ4:50:31
*/
package cn.xysfxy.di_03.lab.dao;

public abstract class SquareDAO implements ShapeDAO {
	protected double a;
	protected double b;

	public SquareDAO(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public SquareDAO() {
	}

	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public abstract double area();
	public abstract double gride();
}
