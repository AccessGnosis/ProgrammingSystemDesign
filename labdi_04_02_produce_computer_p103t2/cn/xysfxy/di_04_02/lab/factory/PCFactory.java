/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: PCFactory.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ10:02:01
*/
package cn.xysfxy.di_04_02.lab.factory;

import cn.xysfxy.di_04_02.lab.production.CPU;
import cn.xysfxy.di_04_02.lab.production.PCCPU;
import cn.xysfxy.di_04_02.lab.production.PCRAM;
import cn.xysfxy.di_04_02.lab.production.RAM;

public class PCFactory implements ComputerFactory {

	@Override
	public CPU produceCPU() {
		return new PCCPU();
	}

	@Override
	public RAM produceRAM() {
		return new PCRAM();
	}
}
