/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ShapeFactory.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: 下午5:11:47
*/
package cn.xysfxy.di_03.lab.factory;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;

/**
 * 改进后的抽象工厂
 * @author gnosis
 *
 */
public interface AbstractShapeFactory {
	ShapeDAO produceShape();
}
