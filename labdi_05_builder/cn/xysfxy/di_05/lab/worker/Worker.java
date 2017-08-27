/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Worker.java
* Copyright 2017-04-06 By Gnosis. Allright reserved.
* Time: обнГ5:35:36
*/
package cn.xysfxy.di_05.lab.worker;

import cn.xysfxy.di_05.lab.builder.ComputerBuilder;
import cn.xysfxy.di_05.lab.production.Computer;

public class Worker {
	private ComputerBuilder combuilder;

	public void setComputerBuilder(ComputerBuilder combuilder) {
		this.combuilder = combuilder;
	}
	public Computer construct() {
		combuilder.builderCPU();
		combuilder.builderRAM();
		combuilder.builderHDD();
		return combuilder.getComputer();
	}
}
