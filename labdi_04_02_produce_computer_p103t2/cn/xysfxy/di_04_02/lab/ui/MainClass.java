/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: MainClass.java
* Copyright 2017-04-04 By Gnosis. Allright reserved.
* Time: обнГ9:59:14
*/
package cn.xysfxy.di_04_02.lab.ui;

import cn.xysfxy.di_04_02.lab.factory.ComputerFactory;
import cn.xysfxy.di_04_02.lab.production.CPU;
import cn.xysfxy.di_04_02.lab.production.RAM;
import cn.xysfxy.di_04_02.lab.util.xml.XMLInfo;

public class MainClass {

	public static void main(String[] args) {
		ComputerFactory cf = XMLInfo.getFactory();
		CPU cpu = cf.produceCPU();
		RAM ram = cf.produceRAM();
		cpu.runCPU();
		ram.runRAM();
	}

}
