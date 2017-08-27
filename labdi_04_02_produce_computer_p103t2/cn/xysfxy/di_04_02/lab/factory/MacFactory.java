/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MacFactory.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ10:05:26
*/
package cn.xysfxy.di_04_02.lab.factory;

import cn.xysfxy.di_04_02.lab.production.CPU;
import cn.xysfxy.di_04_02.lab.production.MacCPU;
import cn.xysfxy.di_04_02.lab.production.MacRAM;
import cn.xysfxy.di_04_02.lab.production.RAM;

public class MacFactory implements ComputerFactory {

	@Override
	public CPU produceCPU() {
		return new MacCPU();
	}

	@Override
	public RAM produceRAM() {
		return new MacRAM();
	}
}
