/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ComputerBuilderFactory.java
* Copyright 2017-04-12 By Gnosis. Allright reserved.
* Time: обнГ10:59:57
*/
package cn.xysfxy.di_05.lab.factory;

import cn.xysfxy.di_05.lab.builder.ComputerBuilder;

public abstract class ComputerBuilderFactory {

	public abstract ComputerBuilderFactory newInstance();

	public abstract ComputerBuilder newComputerBuilder();
}
