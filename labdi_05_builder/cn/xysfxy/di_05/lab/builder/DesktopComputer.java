/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: DesktopComputer.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: ����5:24:19
*/
package cn.xysfxy.di_05.lab.builder;

public class DesktopComputer extends ComputerBuilder {

	// ��д���е��Ծ��е�builder����
	@Override
	public void builderCPU() {
		computer.setCPU("Desktop Computer's CPU was built");
	}

	@Override
	public void builderRAM() {
		computer.setRAM("Desktop Computer's RAM was built");
	}

	@Override
	public void builderHDD() {
		computer.setHDD("Desktop Computer's HDD was built");
	}

}
