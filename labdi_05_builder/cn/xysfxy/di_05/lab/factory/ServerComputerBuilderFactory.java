/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ServerComputerBuilderFactory.java
* Copyright 2017-04-12 By Gnosis. Allright reserved.
* Time: обнГ11:12:58
*/
package cn.xysfxy.di_05.lab.factory;

import cn.xysfxy.di_05.lab.builder.ComputerBuilder;
import cn.xysfxy.di_05.lab.builder.ServerComputer;

public class ServerComputerBuilderFactory extends ComputerBuilderFactory {

	@Override
	public ComputerBuilderFactory newInstance() {
		return new ServerComputerBuilderFactory();
	}

	@Override
	public ComputerBuilder newComputerBuilder() {
		return new ServerComputer();
	}

}
