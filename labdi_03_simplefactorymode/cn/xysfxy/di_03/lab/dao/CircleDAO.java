/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CircleDAO.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ4:49:39
*/
package cn.xysfxy.di_03.lab.dao;

public abstract class CircleDAO implements ShapeDAO {
	protected double r;

	public CircleDAO(double r) {
		this.r = r;
	}
	public CircleDAO() {
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public abstract double area();
	public abstract double gride();
}
