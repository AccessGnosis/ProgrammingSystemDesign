/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ShapeFactory.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: ����5:11:47
*/
package cn.xysfxy.di_03.lab.factory;

import cn.xysfxy.di_03.lab.dao.ShapeDAO;

/**
 * �Ľ���ĳ��󹤳�
 * @author gnosis
 *
 */
public interface AbstractShapeFactory {
	ShapeDAO produceShape();
}
