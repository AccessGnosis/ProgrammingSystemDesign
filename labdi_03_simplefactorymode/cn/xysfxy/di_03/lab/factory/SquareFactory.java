/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: SquareFactory.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ5:16:58
*/
package cn.xysfxy.di_03.lab.factory;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;
import cn.xysfxy.di_03.lab.daoimp.Square;

public class SquareFactory implements AbstractShapeFactory {
	private double a, b;

	public SquareFactory(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public ShapeDAO produceShape() {
		return new Square(a, b);
	}
}
