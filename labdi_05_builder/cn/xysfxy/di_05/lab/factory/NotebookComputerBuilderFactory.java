/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: NotebookComputer.java
* Copyright 2017-04-12 By Gnosis. Allright reserved.
* Time: обнГ11:11:51
*/
package cn.xysfxy.di_05.lab.factory;

import cn.xysfxy.di_05.lab.builder.ComputerBuilder;
import cn.xysfxy.di_05.lab.builder.NotebookComputer;

public class NotebookComputerBuilderFactory extends ComputerBuilderFactory {

	@Override
	public ComputerBuilderFactory newInstance() {
		return new NotebookComputerBuilderFactory();
	}

	@Override
	public ComputerBuilder newComputerBuilder() {
		return new NotebookComputer();
	}

}
