/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InfoUtil.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: ����5:53:41
*/
package cn.xysfxy.di_03.lab.ui;

import java.io.InputStream;
import java.util.Properties;

import cn.xysfxy.di_03.lab.factory.AbstractShapeFactory;

/**
 * ��Ϣ������
 * ��Ҫ���ܣ���ȡshape.properties�е�key��Ӧ��valueֵ���������з��������࣬�ﵽ���Ĵ����޸������ļ���ò�ͬ����Ĺ���
 * @author gnosis
 *
 */
public class InfoUtil {
	public static AbstractShapeFactory getFactory() {
		AbstractShapeFactory sf = null;
		try {
			InputStream input = InfoUtil.class.getClassLoader()
					.getResourceAsStream(
							"cn/xysfxy/di_03/lab/ui/shape.properties");
			Properties p = new Properties();
			p.load(input);

			String factoryName = p.getProperty("shape");
			sf =  (AbstractShapeFactory) Class.forName(factoryName)
					.newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sf;
	}
}
