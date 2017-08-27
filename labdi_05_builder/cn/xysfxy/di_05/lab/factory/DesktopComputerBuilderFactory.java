/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DesktopComputerFactory.java
* Copyright 2017-04-12 By Gnosis. Allright reserved.
* Time: обнГ11:10:20
*/
package cn.xysfxy.di_05.lab.factory;

import cn.xysfxy.di_05.lab.builder.ComputerBuilder;
import cn.xysfxy.di_05.lab.builder.DesktopComputer;

public class DesktopComputerBuilderFactory extends ComputerBuilderFactory {

	@Override
	public ComputerBuilderFactory newInstance() {
		return new DesktopComputerBuilderFactory();
	}

	@Override
	public ComputerBuilder newComputerBuilder() {
		return new DesktopComputer();
	}

}
