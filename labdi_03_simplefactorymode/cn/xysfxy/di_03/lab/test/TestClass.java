/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: TestClass.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: 下午5:05:06
*/
package cn.xysfxy.di_03.lab.test;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;
import cn.xysfxy.di_03.lab.daoimp.Circle;
import cn.xysfxy.di_03.lab.daoimp.Square;
import cn.xysfxy.di_03.lab.daoimp.Triangle;
import cn.xysfxy.di_03.lab.exception.UnSupportedShapeException;
import cn.xysfxy.di_03.lab.factory.AbstractShapeFactory;
import cn.xysfxy.di_03.lab.factory.CircleFactory;
import cn.xysfxy.di_03.lab.factory.ShapeFactory;
import cn.xysfxy.di_03.lab.factory.TriangleFactory;

public class TestClass {

	public static void main(String[] args) throws UnSupportedShapeException {
		ShapeDAO cir = new Circle(10);
		System.out.println(cir.area());
		System.out.println(cir.gride());
		ShapeDAO tag = new Triangle(2, 2, 2);
		System.out.println(tag.area());
		System.out.println(tag.gride());
		ShapeDAO squ = new Square(1, 2);
		System.out.println(squ.area());
		System.out.println(squ.gride());

		AbstractShapeFactory afcir = new CircleFactory(10);
		ShapeDAO fcir = afcir.produceShape();
		System.out.println(fcir.area());
		System.out.println(fcir.gride());

		ShapeDAO aftag = ShapeFactory.produceShape("triangle");
		System.out.println(aftag.area());
		System.out.println(aftag.gride());

		// 抛出自定义异常 UnSupportedShapeException
		try {
			ShapeDAO afrhm = ShapeFactory.produceShape("rhombus");
		} catch (IllegalArgumentException e) {
			System.out.println("抛出自定义异常 UnSupportedShapeException");
			e.printStackTrace();
		}
	}

}
