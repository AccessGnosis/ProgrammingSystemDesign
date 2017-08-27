/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: NotebookComputer.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: обнГ5:30:23
*/
package cn.xysfxy.di_05.lab.builder;

public class NotebookComputer extends ComputerBuilder {

	@Override
	public void builderCPU() {
		computer.setCPU("Notebook Computer's CPU was built");
	}

	@Override
	public void builderRAM() {
		computer.setRAM("Notebook Computer's RAM was built");
	}

	@Override
	public void builderHDD() {
		computer.setHDD("Notebook Computer's HDD was built");
	}

}
