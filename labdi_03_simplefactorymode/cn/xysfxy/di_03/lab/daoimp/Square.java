/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Square.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ5:01:33
*/
package cn.xysfxy.di_03.lab.daoimp;

import cn.xysfxy.di_03.lab.dao.SquareDAO;

public class Square extends SquareDAO {

	public Square(double a, double b) {
		super(a, b);
	}
	public Square(){}
	@Override
	public double area() {
		return a * b;
	}

	@Override
	public double gride() {
		return 2 * (a + b);
	}

}
