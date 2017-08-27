/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: InfoUtil.java
* Copyright 2017-03-23 By Gnosis. Allright reserved.
* Time: 下午5:53:41
*/
package cn.xysfxy.di_03.lab.ui;

import java.io.InputStream;
import java.util.Properties;

import cn.xysfxy.di_03.lab.factory.AbstractShapeFactory;

/**
 * 信息工具类
 * 主要功能：提取shape.properties中的key对应的value值，在主类中反射生成类，达到不改代码修改配置文件获得不同结果的功能
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
