/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: CircleFactory.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: обнГ5:14:24
*/
package cn.xysfxy.di_03.lab.factory;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;
import cn.xysfxy.di_03.lab.daoimp.Circle;

public class CircleFactory implements AbstractShapeFactory {
	private double r;

	public CircleFactory(double r) {
		this.r = r;
	}
	public CircleFactory() {
	}

	@Override
	public ShapeDAO produceShape() {
		return new Circle(r);
	}

}
