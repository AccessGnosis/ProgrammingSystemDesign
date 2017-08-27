/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: ComputerBuilder.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: обнГ5:21:50
*/
package cn.xysfxy.di_05.lab.builder;

import cn.xysfxy.di_05.lab.production.Computer;

public abstract class ComputerBuilder {
	Computer computer = new Computer();

	public abstract void builderCPU();
	public abstract void builderRAM();
	public abstract void builderHDD();
	public Computer getComputer(){
		return computer;
	}
}
