/**
* Describe: ����
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: ����4:42:24
*/
package cn.xysfxy.di_03.lab.ui;

import cn.xysfxy.di_03.lab.dao.CircleDAO;
import cn.xysfxy.di_03.lab.dao.ShapeDAO;
import cn.xysfxy.di_03.lab.dao.TriangleDAO;
import cn.xysfxy.di_03.lab.daoimp.Circle;
import cn.xysfxy.di_03.lab.daoimp.Triangle;
import cn.xysfxy.di_03.lab.exception.UnSupportedShapeException;
import cn.xysfxy.di_03.lab.factory.AbstractShapeFactory;
import cn.xysfxy.di_03.lab.factory.CircleFactory;
import cn.xysfxy.di_03.lab.factory.ShapeFactory;
import cn.xysfxy.di_03.lab.factory.TriangleFactory;

public class MainClass {

	public static void main(String[] args) throws UnSupportedShapeException {
		// �Ľ�����ģʽ
		AbstractShapeFactory afcir = new CircleFactory(10);
		ShapeDAO fcir = afcir.produceShape();
		System.out.println(fcir.area());
		System.out.println(fcir.gride());

		// �򵥹���ģʽ
		// δʵ�ֶ���������ܣ��ṩ���Ա���
		ShapeDAO aftag = ShapeFactory.produceShape("triangle");
		((TriangleDAO) aftag).setA(10);
		((TriangleDAO) aftag).setB(10);
		((TriangleDAO) aftag).setC(10);
		System.out.println(aftag.area());
		System.out.println(aftag.gride());

		// �׳��Զ����쳣 UnSupportedShapeException
		try {
			ShapeDAO afrhm = ShapeFactory.produceShape("rhombus");
		} catch (UnSupportedShapeException e) {
			System.out.println("�׳��Զ����쳣 UnSupportedShapeException");
			e.printStackTrace();
		}

		AbstractShapeFactory aftag1 = InfoUtil.getFactory();
		ShapeDAO ftag1 = aftag1.produceShape();
		((CircleDAO) ftag1).setR(10);
		System.out.println(ftag1.area());
	}

}
