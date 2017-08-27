/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ShapeFactory.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: ÏÂÎç5:37:18
*/
package cn.xysfxy.di_03.lab.factory;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;
import cn.xysfxy.di_03.lab.daoimp.Circle;
import cn.xysfxy.di_03.lab.daoimp.Square;
import cn.xysfxy.di_03.lab.daoimp.Triangle;
import cn.xysfxy.di_03.lab.exception.UnSupportedShapeException;

/**
 * ¾²Ì¬¹¤³§
 * @author gnosis
 *
 */
public class ShapeFactory {
	public static ShapeDAO produceShape(String shapeName) throws UnSupportedShapeException {
		ShapeDAO shape = null;
		if ("triangle".equals(shapeName)) {
			shape = new Triangle();
		} else if ("circle".equals(shapeName)) {
			shape = new Circle();
		} else if ("square".equals(shapeName)) {
			shape = new Square();
		} else {
			throw new UnSupportedShapeException("UnSupportedShapeException");
		}
		return shape;
	}
}
