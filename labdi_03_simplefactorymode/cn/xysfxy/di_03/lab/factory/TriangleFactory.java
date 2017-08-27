/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TriangleFactory.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ5:18:50
*/
package cn.xysfxy.di_03.lab.factory;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;
import cn.xysfxy.di_03.lab.daoimp.Triangle;

public class TriangleFactory implements AbstractShapeFactory {
	private double a, b, c;

	public TriangleFactory(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public ShapeDAO produceShape() {
		return new Triangle(a, b, c);
	}

}
